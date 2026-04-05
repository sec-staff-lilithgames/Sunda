package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.b1;
import androidx.lifecycle.k0;
import c6.a;
import c6.b;
import java.util.Collections;
import java.util.List;
import s4.s;
import s4.t;
import s4.u;
import s4.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // c6.b
    public List<Class<? extends b>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // c6.b
    public Boolean create(Context context) {
        u uVar = new u(new w(context));
        uVar.setMetadataLoadStrategy(1);
        s.init(uVar);
        k0 lifecycle = ((b1) a.getInstance(context).initializeComponent(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new t(this, lifecycle));
        return Boolean.TRUE;
    }
}
