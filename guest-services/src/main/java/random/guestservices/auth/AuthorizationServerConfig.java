package random.guestservices.auth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@EnableAuthorizationServer
@Configuration
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Value("${client.id}")
    String clientId;
    @Value("${secret}")
    String secret;
    @Value("${client.id.audit}")
    String clientIdAudit;
    @Value("${secret.audit}")
    String secretAudit;

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.passwordEncoder(NoOpPasswordEncoder.getInstance())
                .checkTokenAccess("permitAll")
                .tokenKeyAccess("permitAll()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient(clientId)
                .scopes("READ_ALL_GUESTS", "WRITE_GUEST", "UPDATE_GUEST")
                .secret(secret)
                .autoApprove(true)
                .authorities("ROLE_GUESTS_AUTHORIZED_CLIENT")
                .authorizedGrantTypes("client_credentials")
                .and()
                .withClient(clientIdAudit)
                .scopes("READ_ALL_GUESTS")
                .secret(secretAudit)
                .autoApprove(true)
                .authorities("ROLE_GUESTS_AUTHORIZED_CLIENT")
                .authorizedGrantTypes("client_credentials");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(new InMemoryTokenStore());
    }

}
