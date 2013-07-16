package net.sareweb.txotx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sareweb.txotx.model.Sagardotegi;
import net.sareweb.txotx.service.SagardotegiLocalServiceUtil;

import com.liferay.portal.kernel.util.ParamUtil;

public class GooglePlusContentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		long sagardotegiId = ParamUtil.getLong(request, "sagardotegiId", 0L);
		try {
			Sagardotegi sagardotegi = SagardotegiLocalServiceUtil
					.getSagardotegi(sagardotegiId);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print(sagardotegi.getIzena());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
