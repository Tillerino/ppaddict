package org.tillerino.ppaddict;

import io.undertow.Undertow;
import tillerino.tillerinobot.MysqlContainer;

/**
 * Starts ppaddict locally on port 8080 with a fake backend.
 */
public class LocalPpaddict {
	public static void main(String[] args) throws Exception {
		MysqlContainer.MysqlDatabaseLifecycle.createSchema();
		Undertow server = PpaddictModule.createGuiceFilterUndertow(PpaddictTestConfig.class);
		server.start();
	}

}
