/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
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
 * Apache-2.0 license and offer limited warranties, support, maintenance, and
 * commercial database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
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

import java.util.Collection;

import org.jooq.QueryPart;
import org.jooq.Record;
// ...
import org.jooq.ResultQuery;
import org.jooq.SelectFieldOrAsterisk;
// ...
import org.jooq.UpdateResultStep;
import org.jooq.impl.QOM.UnmodifiableList;
import org.jooq.impl.QOM.Update;
import org.jooq.impl.QOM.UpdateReturning;

/**
 * A wrapped {@link Update} that works like a {@link ResultQuery}.
 *
 * @author Lukas Eder
 */
final class UpdateAsResultQuery<R extends Record>
extends
    AbstractDMLQueryAsResultQuery<R, UpdateQueryImpl<R>>
implements
    UpdateResultStep<R>,
    QOM.UpdateReturning<R>
{

    UpdateAsResultQuery(UpdateQueryImpl<R> delegate, boolean returningResult) {
        super(delegate, returningResult);
    }

    @Override
    public final Update<?> $update() {
        return getDelegate();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public final UpdateReturning<R> $update(Update<?> newUpdate) {
        return new UpdateAsResultQuery(Tools.updateQueryImpl(newUpdate).copy(d -> d.setReturning($returning())), returningResult);
    }

    @Override
    public final UnmodifiableList<? extends SelectFieldOrAsterisk> $returning() {
        return QOM.unmodifiable(getDelegate().returning);
    }

    @Override
    public final UpdateReturning<?> $returning(Collection<? extends SelectFieldOrAsterisk> returning) {
        return new UpdateAsResultQuery<>(getDelegate().copy(d -> d.setReturning(returning)), returningResult);
    }


























}