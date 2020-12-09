/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.Internal.*;
import static org.jooq.impl.Keywords.*;
import static org.jooq.impl.Names.*;
import static org.jooq.impl.SQLDataType.*;
import static org.jooq.impl.Tools.*;
import static org.jooq.impl.Tools.BooleanDataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.impl.*;

import java.math.*;
import java.util.*;

/**
 * The <code>ASCII</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
final class Ascii
extends
    AbstractField<Integer>
{

    private static final long serialVersionUID = 1L;

    private final Field<String> string;

    Ascii(
        Field<String> string
    ) {
        super(N_ASCII, allNotNull(INTEGER, string));

        this.string = nullSafeNotNull(string, VARCHAR);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------



    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {






            case FIREBIRD:
                ctx.visit(N_ASCII_VAL).sql('(').visit(string).sql(')');
                break;

            // TODO [#862] [#864] emulate this for some dialects



            case DERBY:
            case SQLITE:
            default:
                ctx.visit(N_ASCII).sql('(').visit(string).sql(')');
                break;
        }
    }


}
