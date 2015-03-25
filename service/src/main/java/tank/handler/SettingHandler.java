package tank.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tank.domain.Setting;
import tank.meme.core.MessageHandler;
import tank.meme.core.net.socket.Request;
import tank.meme.core.net.socket.Response;
import tank.meme.core.net.socket.SocketSession;
import tank.service.ISettingService;

/**
 * @author tank
 * @email kaixiong.tan@qq.com
 * @date:2015年3月24日 下午4:01:43
 * @description:
 * @version :0.1
 */
@Controller
public class SettingHandler extends MessageHandler {
	@Autowired
	private ISettingService service;

	public String getHandlerName() {

		return "set-load";
	}

	public void handler(SocketSession session, Request request) {

		Setting setting = new Setting();
		setting.setId(Math.random() * 10000 + "_id");
		setting.setUserId("f8c3fd60-7bea-4cee-ae30-464e45af4322");
		setting.setVal("test");
		service.save(setting);

		Response response = new Response(this.getHandlerName());
		response.setData(new Object[] { setting.getId(),"test updata jar" });

		session.write(response);
	}

}
