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

	public EventLogger(String fileName) {//������ ����, ����� �ǰ� �Ѵ�.
		try {
			logmanager=LogManager.getLogManager();//���� �־��ش�.
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName);//����Ѵ�.
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void log(String logMessage) {//log ���� �� logMessage ���
		logger.info(logMessage);//������ ���� ������ �Ѵ�.
	}
}
