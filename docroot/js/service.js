Liferay.Service.register("Liferay.Service.Txotx", "net.sareweb.txotx.service", "Txotx-portlet");

Liferay.Service.registerClass(
	Liferay.Service.Txotx, "APKVersion",
	{
		getLastAPKVersion: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Txotx, "Gertaera",
	{
		gehituTestuGertaera: true,
		gehituTestuGertaeraSagardotegian: true,
		gehituTestuGertaeraSagardoEgunean: true,
		gehituArgazkiGertaera: true,
		gehituArgazkiGertaeraSagardotegian: true,
		gehituArgazkiGertaeraSagardoEgunean: true,
		gehituBalorazioGertaera: true,
		gehituBalorazioGertaeraSagardotegian: true,
		gehituBalorazioGertaeraSagardoEgunean: true,
		getGertaerakOlderThanDate: true,
		getGertaerakSagardotegianOlderThanDate: true,
		getGertaerakSagardoEguneanOlderThanDate: true,
		getGertaerakNewerThanDate: true,
		getGertaerakSagardotegianNewerThanDate: true,
		getGertaerakSagardoEguneanNewerThanDate: true,
		fake: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Txotx, "GoogleDevice",
	{
		addGoogleDevice: true,
		unregisterGoogleDevice: true,
		getGoogleDevicesByUserId: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Txotx, "Jarraipen",
	{
		gehituJarraipenaByEmail: true,
		gehituJarraipena: true,
		getJarraipenakByEmail: true,
		getJarraipenak: true,
		getErabiltzailearenJarraitzaileak: true,
		getSagardotegiarenJarraitzaileak: true,
		getSagardoEgunarenJarraitzaileak: true,
		deleteJarraipena: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Txotx, "Oharra",
	{
		getAzkenErronka: true,
		getAzkenOharra: true,
		getOharra: true,
		bidaliOharra: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Txotx, "SagardoEgun",
	{
		getSagardoEgun: true,
		getSagardoEgunak: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Txotx, "Sagardotegi",
	{
		getSagardotegia: true,
		getSagardotegiak: true,
		resetPassword: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Txotx, "Sailkapena",
	{
		getSailkapenak: true
	}
);