/*
 * Copyright 2018 Dash Core Group
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
 *
 * This file was generated by SWIG (http://www.swig.org) and modified.
 * Version 3.0.12
 */

package org.ltpj.bls;

import com.google.common.base.Preconditions;

public class PrivateKeyVector extends java.util.AbstractList<PrivateKey> {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PrivateKeyVector(long cPtr, boolean cMemoryOwn) {
    Preconditions.checkArgument(cPtr != 0);
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PrivateKeyVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JNI.delete_PrivateKeyVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PrivateKeyVector(java.util.Collection<PrivateKey> e) {
    this.reserve(e.size());
    for(PrivateKey value: e) {
      this.push_back(value);
    }
  }

  public PrivateKeyVector() {
    this(JNI.new_PrivateKeyVec__SWIG_0(), true);
  }

  public PrivateKeyVector(PrivateKeyVector o) {
    this(JNI.new_PrivateKeyVec__SWIG_2(PrivateKeyVector.getCPtr(o), o), true);
  }

  public long capacity() {
    return JNI.PrivateKeyVec_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    JNI.PrivateKeyVec_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return JNI.PrivateKeyVec_isEmpty(swigCPtr, this);
  }

  public void clear() {
    JNI.PrivateKeyVec_clear(swigCPtr, this);
  }

  public void push_back(PrivateKey x) {
    Preconditions.checkNotNull(x);
    JNI.PrivateKeyVec_push_back(swigCPtr, this, PrivateKey.getCPtr(x), x);
  }

  public PrivateKey get(int i) {
    return new PrivateKey(JNI.PrivateKeyVec_get(swigCPtr, this, i), false);
  }

  public PrivateKey set(int i, PrivateKey VECTOR_VALUE_IN) {
    Preconditions.checkNotNull(VECTOR_VALUE_IN);
    return new PrivateKey(JNI.PrivateKeyVec_set(swigCPtr, this, i, PrivateKey.getCPtr(VECTOR_VALUE_IN), VECTOR_VALUE_IN), true);
  }

  public int size() {
    return JNI.PrivateKeyVec_size(swigCPtr, this);
  }

  public void removeRange(int from, int to) {
    JNI.PrivateKeyVec_removeRange(swigCPtr, this, from, to);
  }

}
