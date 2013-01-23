create table Txotx_Gertaera (
	gertaeraId LONG not null primary key,
	sagardotegiId LONG,
	userId LONG,
	screenName VARCHAR(75) null,
	gertaeraMota VARCHAR(75) null,
	testua VARCHAR(75) null,
	irudiKarpetaId LONG,
	irudia VARCHAR(75) null,
	balorazioa LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table Txotx_Sagardotegi (
	sagardotegiId LONG not null primary key,
	izena VARCHAR(75) null,
	herria VARCHAR(75) null,
	helbidea VARCHAR(75) null,
	telefonoa VARCHAR(75) null,
	emaila VARCHAR(75) null,
	weborria VARCHAR(75) null,
	lat DOUBLE,
	lng DOUBLE,
	edukiera LONG,
	irudiKarpetaId LONG,
	irudia VARCHAR(75) null,
	balorazioKopurua LONG,
	balorazioenBB DOUBLE,
	createDate DATE null,
	modifiedDate DATE null
);