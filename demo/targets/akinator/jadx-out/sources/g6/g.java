package g6;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f57342a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f57343b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57344c;

    /* renamed from: d, reason: collision with root package name */
    public final DataOutputStream f57345d;

    public g(int i10, DataOutputStream dataOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f57342a = byteArrayOutputStream;
        this.f57343b = new DataOutputStream(byteArrayOutputStream);
        this.f57344c = i10;
        this.f57345d = dataOutputStream;
    }
}
