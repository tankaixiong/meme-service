package tank.handler;

import org.springframework.stereotype.Controller;

import tank.constant.HandlerType;
import tank.meme.core.MessageHandler;
import tank.meme.core.net.socket.Request;
import tank.meme.core.net.socket.SocketSession;

/**
 * @author tank
 * @date:27 Nov 2014 14:52:04
 * @description:登录
 * @version :1.0
 */
@Controller
public class RegisterHandler extends MessageHandler {

	public String getHandlerName() {
		return HandlerType.REGISTER;
	}

	public void handler(SocketSession session, Request request) {

		// Response response = new Response();
		// response.setAct(this.getHandlerName());
		// response.setData(new Object[] { "1" });
		//
		// session.write(response);

		super.write(new Object[] { 123 });
	}

}
