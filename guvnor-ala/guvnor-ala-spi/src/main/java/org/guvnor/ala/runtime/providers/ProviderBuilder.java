/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.guvnor.ala.runtime.providers;

import java.util.Optional;
import java.util.function.Function;

import org.guvnor.ala.config.ProviderConfig;

/*
 * Fluent Builder to create Providers
 * @param <T extends ProviderConfig> config used to create a Provider
 * @param <R extends Provider> Provider to be created
*/
public interface ProviderBuilder<T extends ProviderConfig, R extends Provider> extends Function<T, Optional<R>> {

    /*
     * Returns true if the Provider supports the provided configuration
     * @param ProviderConfig the configuration to build the provider
     * @returns boolean 
    */
    boolean supports(final ProviderConfig config);
}
