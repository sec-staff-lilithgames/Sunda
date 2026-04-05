package o4;

import com.ironsource.C3191e4;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import o4.j;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final c f77474e = new c(1);

    @Override // kv.l
    public final CharSequence invoke(Map.Entry<j.a, Object> entry) {
        e0.checkNotNullParameter(entry, "entry");
        Object value = entry.getValue();
        return "  " + entry.getKey().getName() + " = " + (value instanceof byte[] ? k0.joinToString$default((byte[]) value, (CharSequence) ", ", (CharSequence) C3191e4.i.f36529d, (CharSequence) C3191e4.i.f36531e, 0, (CharSequence) null, (kv.l) null, 56, (Object) null) : String.valueOf(entry.getValue()));
    }
}
