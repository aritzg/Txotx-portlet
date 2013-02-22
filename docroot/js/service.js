Liferay.Service.register("Liferay.Service.Txotx", "net.sareweb.txotx.service", "Txotx-portlet");

Liferay.Service.registerClass(
	Liferay.Service.Txotx, "Gertaera",
	{
		gehituTestuGertaera: true,
		gehituArgazkiGertaera: true,
		gehituBalorazioGertaera: true,
		getGertaerakOlderThanDate: true,
		getGertaerakNewerThanDate: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Txotx, "GoogleDevice",
	{
		addGoogeDevice: true,
		getGoogleDevicesByUserId: true
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