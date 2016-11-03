/**
 * This class is generated by jOOQ
 */
package com.instructure.bridge;


import com.instructure.bridge.tables.SchemaVersion;
import com.instructure.bridge.tables.records.SchemaVersionRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = UniqueKeys0.SCHEMA_VERSION_PK;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = createUniqueKey(SchemaVersion.SCHEMA_VERSION, SchemaVersion.SCHEMA_VERSION.VERSION);
	}
}
