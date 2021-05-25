package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;

	public EventLogger(String fileName) {//생성자 생성, 기록이 되게 한다.
		try {
			logmanager=LogManager.getLogManager();//값을 넣어준다.
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName);//기록한다.
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void log(String logMessage) {//log 했을 때 logMessage 출력
		logger.info(logMessage);//적절한 정보 나오게 한다.
	}
}
