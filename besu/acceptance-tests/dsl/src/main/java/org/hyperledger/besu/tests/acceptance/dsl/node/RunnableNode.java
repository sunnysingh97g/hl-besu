/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.besu.tests.acceptance.dsl.node;

import org.hyperledger.besu.datatypes.Address;
import org.hyperledger.besu.tests.acceptance.dsl.condition.Condition;
import org.hyperledger.besu.tests.acceptance.dsl.node.configuration.NodeConfiguration;

import java.net.URI;
import java.util.Optional;

public interface RunnableNode extends Node {

  void stop();

  void close();

  void start(BesuNodeRunner runner);

  NodeConfiguration getConfiguration();

  void awaitPeerDiscovery(final Condition condition);

  String getName();

  Address getAddress();

  URI enodeUrl();

  String getNodeId();

  Optional<Integer> exitCode();
}
