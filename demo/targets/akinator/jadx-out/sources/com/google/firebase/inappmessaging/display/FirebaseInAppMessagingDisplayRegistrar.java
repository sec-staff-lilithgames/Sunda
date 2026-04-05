package com.google.firebase.inappmessaging.display;

import android.app.Application;
import bi.c;
import bi.d;
import bi.q;
import bj.w0;
import bk.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.g;
import ej.j;
import java.util.Arrays;
import java.util.List;
import jj.f;
import jj.h;
import jj.n;
import kj.a;
import kj.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class FirebaseInAppMessagingDisplayRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiamd";

    /* JADX INFO: Access modifiers changed from: private */
    public j buildFirebaseInAppMessagingUI(d dVar) {
        g gVar = (g) dVar.get(g.class);
        w0 w0Var = (w0) dVar.get(w0.class);
        Application application = (Application) gVar.getApplicationContext();
        j jVarProvidesFirebaseInAppMessagingUI = ((f) h.builder().universalComponent(n.builder().applicationModule(new a(application)).build()).headlessInAppMessagingModule(new e(w0Var)).build()).providesFirebaseInAppMessagingUI();
        application.registerActivityLifecycleCallbacks(jVarProvidesFirebaseInAppMessagingUI);
        return jVarProvidesFirebaseInAppMessagingUI;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.builder(j.class).name(LIBRARY_NAME).add(q.required((Class<?>) g.class)).add(q.required((Class<?>) w0.class)).factory(new bi.a(this, 3)).eagerInDefaultApp().build(), i.create(LIBRARY_NAME, "22.0.1"));
    }
}
