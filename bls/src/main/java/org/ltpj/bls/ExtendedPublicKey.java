/*
 * Copyright 2018 LifetionCoin Core Group
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

import java.util.Arrays;

public class ExtendedPublicKey extends BLSObject {

  protected ExtendedPublicKey(long cPtr, boolean cMemoryOwn) {
    super(cPtr, cMemoryOwn);
  }

  protected static long getCPtr(ExtendedPublicKey obj) {
    return (obj == null) ? 0 : obj.cPointer;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    JNI.delete_ExtendedPublicKey(cPointer);
  }

  public static ExtendedPublicKey FromBytes(byte[] serialized) {
    Preconditions.checkNotNull(serialized);
    //Preconditions.checkArgument(serialized.length == EXTENDED_PUBLIC_KEY_SIZE);
    return new ExtendedPublicKey(JNI.ExtendedPublicKey_FromBytes(serialized), true);
  }

  public ExtendedPublicKey PublicChild(long i) {
    boolean hardened = (i & 1 << 31) != 0;
    Preconditions.checkArgument (!hardened, "Cannot derive hardened children from public key");
    return new ExtendedPublicKey(JNI.ExtendedPublicKey_PublicChild(cPointer, this, i), true);
  }

  public long GetVersion() {
    return JNI.ExtendedPublicKey_GetVersion(cPointer, this);
  }

  public short GetDepth() {
    return JNI.ExtendedPublicKey_GetDepth(cPointer, this);
  }

  public long GetParentFingerprint() {
    return JNI.ExtendedPublicKey_GetParentFingerprint(cPointer, this);
  }

  public long GetChildNumber() {
    return JNI.ExtendedPublicKey_GetChildNumber(cPointer, this);
  }

  public ChainCode GetChainCode() {
    return new ChainCode(JNI.ExtendedPublicKey_GetChainCode(cPointer, this), true);
  }

  public PublicKey GetPublicKey() {
    return new PublicKey(JNI.ExtendedPublicKey_GetPublicKey(cPointer, this), true);
  }

  public void Serialize(byte[] buffer) {
    Preconditions.checkNotNull(buffer);
    Preconditions.checkArgument(buffer.length >= EXTENDED_PUBLIC_KEY_SIZE);
    JNI.ExtendedPublicKey_Serialize__SWIG_0(cPointer, this, buffer);
  }

  public byte [] Serialize() {
    byte [] bytes = new byte[(int)EXTENDED_PUBLIC_KEY_SIZE];
    Serialize(bytes);
    return bytes;
  }
  
  @Override
  public String toString() {
    return "ExtendedPublicKey(" + Utils.HEX.encode(Serialize()) + ")";
  }

  public final static long VERSION = JNI.ExtendedPublicKey_VERSION_get();
  public final static long EXTENDED_PUBLIC_KEY_SIZE = JNI.ExtendedPublicKey_EXTENDED_PUBLIC_KEY_SIZE_get();

  @Override
  public boolean equals(Object obj) {
    if (obj == null || !(obj instanceof ExtendedPublicKey))
      return false;
    ExtendedPublicKey epk = (ExtendedPublicKey) obj;
    byte[] theseBytes = new byte[(int) EXTENDED_PUBLIC_KEY_SIZE];
    Serialize(theseBytes);
    byte[] bytes = new byte[(int) EXTENDED_PUBLIC_KEY_SIZE];
    epk.Serialize(bytes);
    return Arrays.equals(theseBytes, bytes);
  }
}
