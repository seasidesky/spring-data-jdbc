/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.jdbc.core.mapping.event;

import lombok.Getter;

import java.util.Optional;

import org.springframework.data.jdbc.core.conversion.AggregateChange;
import org.springframework.data.jdbc.core.mapping.event.Identifier.Specified;
import org.springframework.lang.Nullable;

/**
 * A {@link SimpleJdbcEvent} which is guaranteed to have an identifier and an entity.
 *
 * @author Jens Schauder
 * @since 1.0
 */
@Getter
public class JdbcEventWithIdAndEntity extends JdbcEventWithId implements WithEntity {

	private static final long serialVersionUID = -3194462549552515519L;

	public JdbcEventWithIdAndEntity(Specified id, Object entity, @Nullable AggregateChange change) {
		super(id, Optional.of(entity), change);
	}
}