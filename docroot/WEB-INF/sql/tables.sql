create table Txotx_Gertaera (
	gertaeraId LONG not null primary key,
	sagardotegiId LONG,
	sagardoEgunId LONG,
	userId LONG,
	screenName VARCHAR(75) null,
	gertaeraMota VARCHAR(75) null,
	testua VARCHAR(1000) null,
	irudiKarpetaId LONG,
	irudia VARCHAR(75) null,
	balorazioa LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table Txotx_GoogleDevice (
	googleDeviceId LONG not null primary key,
	userId LONG,
	emailAddress VARCHAR(75) null,
	registrationId VARCHAR(500) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table Txotx_Jarraipen (
	jarraipenId LONG not null primary key,
	jarraitzaileUserId LONG,
	sagardotegiId LONG,
	sagardoEgunId LONG,
	jarraituaUserId LONG,
	jarraipenMota VARCHAR(75) null,
	createDate DATE null
);

create table Txotx_Oharra (
	oharraId LONG not null primary key,
	oharMota VARCHAR(75) null,
	irudiKarpetaId LONG,
	irudia VARCHAR(75) null,
	izenburua VARCHAR(75) null,
	testua VARCHAR(1000) null,
	esteka VARCHAR(75) null,
	estekaTestua VARCHAR(75) null,
	createDate DATE null
);

create table Txotx_SagardoEgun (
	sagardoEgunId LONG not null primary key,
	izena VARCHAR(75) null,
	edizioa LONG,
	herria VARCHAR(75) null,
	lekua VARCHAR(75) null,
	emaila VARCHAR(75) null,
	twitter VARCHAR(75) null,
	weborria VARCHAR(75) null,
	hasieraDate DATE null,
	lat DOUBLE,
	lng DOUBLE,
	irudiKarpetaId LONG,
	irudia VARCHAR(75) null,
	irudiKopurua LONG,
	iruzkinKopurua LONG,
	balorazioKopurua LONG,
	balorazioenBB DOUBLE,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG
);

create table Txotx_Sagardotegi (
	sagardotegiId LONG not null primary key,
	izena VARCHAR(75) null,
	herria VARCHAR(75) null,
	helbidea VARCHAR(75) null,
	telefonoa VARCHAR(75) null,
	emaila VARCHAR(75) null,
	twitter VARCHAR(75) null,
	weborria VARCHAR(75) null,
	lat DOUBLE,
	lng DOUBLE,
	edukiera LONG,
	irudiKarpetaId LONG,
	irudia VARCHAR(75) null,
	irudiKopurua LONG,
	iruzkinKopurua LONG,
	balorazioKopurua LONG,
	balorazioenBB DOUBLE,
	createDate DATE null,
	modifiedDate DATE null
);

create table Txotx_Sailkapena (
	sailkapenaId LONG not null primary key,
	userId LONG,
	screenName VARCHAR(75) null,
	iruzkinKopurua LONG,
	balorazioKopurua LONG,
	argazkiKopurua LONG,
	gertaeraKopurua LONG
);