INSERT INTO USER (USERNAME, PASSWORD) VALUES ('admin', '$2a$11$ruEtWdfJoWIau4F2orYUKuMtxA955/JLhvcOLfvAk/Zi/wt.J596m');
INSERT INTO USER (USERNAME, PASSWORD) VALUES ('user', '$2a$11$dK7n/M7fFAtIKXXE.iZhC.B3YNfcnVF2una106bTG7X09M8xF3s4i');

INSERT INTO AUTH_USER_GROUP (USERNAME, AUTH_GROUP) VALUES('admin', 'USER');
INSERT INTO AUTH_USER_GROUP (USERNAME, AUTH_GROUP) VALUES('admin', 'ADMIN');
INSERT INTO AUTH_USER_GROUP (USERNAME, AUTH_GROUP) VALUES('user', 'USER');