package u4;

import android.text.Editable;
import s4.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f87833a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f87834b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f87835c;

    public static Editable.Factory getInstance() {
        if (f87834b == null) {
            synchronized (f87833a) {
                try {
                    if (f87834b == null) {
                        b bVar = new b();
                        try {
                            f87835c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        f87834b = bVar;
                    }
                } finally {
                }
            }
        }
        return f87834b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f87835c;
        return cls != null ? q0.create(cls, charSequence) : super.newEditable(charSequence);
    }
}
