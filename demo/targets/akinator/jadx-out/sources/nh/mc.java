package nh;

import java.util.LinkedList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class mc implements mh.v2 {

    /* renamed from: b, reason: collision with root package name */
    public static final mc f76477b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ mc[] f76478c;

    static {
        mc mcVar = new mc("INSTANCE", 0);
        f76477b = mcVar;
        f76478c = new mc[]{mcVar};
    }

    public static mc valueOf(String str) {
        return (mc) Enum.valueOf(mc.class, str);
    }

    public static mc[] values() {
        return (mc[]) f76478c.clone();
    }

    @Override // mh.v2
    public List<?> get() {
        return new LinkedList();
    }
}
