/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ratpack.session.internal;

/**
 * Provides a type wrapper to contain the hash code for a
 * {@link ratpack.session.store.SessionStorage}
 */
public class StorageHashContainer {
  final private int hashCode;

  public StorageHashContainer(int hashCode) {
    this.hashCode = hashCode;
  }

  public int getHashCode() {
    return hashCode;
  }
}
