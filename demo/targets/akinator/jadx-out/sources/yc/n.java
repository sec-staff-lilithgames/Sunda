package yc;

import dd.g0;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface n {
    a arrayNode();

    a arrayNode(int i10);

    a0 binaryNode(byte[] bArr);

    a0 binaryNode(byte[] bArr, int i10, int i11);

    a0 booleanNode(boolean z10);

    a0 nullNode();

    a0 numberNode(byte b10);

    a0 numberNode(double d10);

    a0 numberNode(float f10);

    a0 numberNode(int i10);

    a0 numberNode(long j10);

    a0 numberNode(Byte b10);

    a0 numberNode(Double d10);

    a0 numberNode(Float f10);

    a0 numberNode(Integer num);

    a0 numberNode(Long l9);

    a0 numberNode(Short sh2);

    a0 numberNode(BigDecimal bigDecimal);

    a0 numberNode(BigInteger bigInteger);

    a0 numberNode(short s10);

    v objectNode();

    a0 pojoNode(Object obj);

    a0 rawValueNode(g0 g0Var);

    a0 textNode(String str);
}
