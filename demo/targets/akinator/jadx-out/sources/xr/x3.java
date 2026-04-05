package xr;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x3 implements w3 {

    /* renamed from: b, reason: collision with root package name */
    public static final x3 f93228b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x3[] f93229c;

    static {
        x3 x3Var = new x3("INSTANCE", 0);
        f93228b = x3Var;
        f93229c = new x3[]{x3Var};
    }

    public static x3 valueOf(String str) {
        return (x3) Enum.valueOf(x3.class, str);
    }

    public static x3[] values() {
        return (x3[]) f93229c.clone();
    }

    @Override // xr.w3
    public List<InetAddress> resolveAddress(String str) throws UnknownHostException {
        return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
    }
}
