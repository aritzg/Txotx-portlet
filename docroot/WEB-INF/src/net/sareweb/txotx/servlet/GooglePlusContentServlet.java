package net.sareweb.txotx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sareweb.txotx.model.SagardoEgun;
import net.sareweb.txotx.model.Sagardotegi;
import net.sareweb.txotx.service.SagardoEgunLocalServiceUtil;
import net.sareweb.txotx.service.SagardotegiLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;

public class GooglePlusContentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			String type = ParamUtil.get(request, "type", "");
			if (type.equals("st")) {
				long sagardotegiId = ParamUtil.getLong(request,
						"sagardotegiId", 0L);
				serveSagardotegiContent(sagardotegiId, out);
			} else if (type.equals("se")) {
				long sagardoEgunId = ParamUtil.getLong(request,
						"sagardoEgunId", 0L);
				serveSagardoEgunContent(sagardoEgunId, out);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void serveSagardotegiContent(long sagardotegiId, PrintWriter out)
			throws PortalException, SystemException {
		Sagardotegi sagardotegi = SagardotegiLocalServiceUtil
				.getSagardotegi(sagardotegiId);
		out.print(sagardotegi.getIzena());
	}

	private void serveSagardoEgunContent(long sagardoEgunId, PrintWriter out)
			throws PortalException, SystemException {
		SagardoEgun sagardoEgun = SagardoEgunLocalServiceUtil
				.getSagardoEgun(sagardoEgunId);
		
		String img = "/documents/10180/" + sagardoEgun.getIrudiKarpetaId() + "/"
		+ sagardoEgun.getIrudia();
		
		out.print("<html><head></head><body><img src=\"" + img + "\"/>" + sagardoEgun.getIzena()+ "</body></html>");
	}

}
