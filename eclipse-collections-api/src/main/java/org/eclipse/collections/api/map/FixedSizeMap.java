/*
 * Copyright (c) 2016 Goldman Sachs.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.eclipse.collections.api.map;

import java.util.Map;

import org.eclipse.collections.api.block.procedure.Procedure;

/**
 * A FixedSizeMap is a map that may be mutated, but cannot grow or shrink in size.
 */
public interface FixedSizeMap<K, V>
        extends MutableMap<K, V>
{
    /**
     * @throws UnsupportedOperationException the <tt>clear</tt> operation is not supported by this map.
     */
    @Override
    void clear();

    /**
     * @throws UnsupportedOperationException the <tt>put</tt> operation is not supported by this map.
     */
    @Override
    V put(K key, V value);

    /**
     * @throws UnsupportedOperationException the <tt>putAll</tt> operation is not supported by this map.
     */
    @Override
    void putAll(Map<? extends K, ? extends V> map);

    /**
     * @throws UnsupportedOperationException the <tt>remove</tt> operation is not supported by this map.
     */
    @Override
    V remove(Object key);

    /**
     * @throws UnsupportedOperationException the <tt>removeKey</tt> operation is not supported by this map.
     */
    @Override
    V removeKey(K key);

    @Override
    FixedSizeMap<K, V> tap(Procedure<? super V> procedure);
}
