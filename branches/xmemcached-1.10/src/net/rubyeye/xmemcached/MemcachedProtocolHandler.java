/**
 *Copyright [2009-2010] [dennis zhuang(killme2008@gmail.com)]
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License.
 *You may obtain a copy of the License at
 *             http://www.apache.org/licenses/LICENSE-2.0
 *Unless required by applicable law or agreed to in writing,
 *software distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *either express or implied. See the License for the specific language governing permissions and limitations under the License
 */
package net.rubyeye.xmemcached;

import java.nio.ByteBuffer;

import net.rubyeye.xmemcached.impl.MemcachedTCPSession;

/**
 * memcached协议解析接口
 *
 * @author dennis
 */
public interface MemcachedProtocolHandler {

	public boolean onReceive(final MemcachedTCPSession session,final ByteBuffer buffer);

}