package com.google.firebase.sessions;

import ai.b;
import android.content.Context;
import bi.b0;
import bi.d;
import bi.q;
import bk.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.g;
import ek.j;
import ek.k;
import ek.v;
import ek.x;
import java.util.List;
import jd.l;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import sj.c;
import tj.f;
import uu.p0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final b0 appContext;
    private static final b0 backgroundDispatcher;
    private static final b0 blockingDispatcher;
    private static final b0 firebaseApp;
    private static final b0 firebaseInstallationsApi;
    private static final b0 firebaseSessionsComponent;
    private static final b0 transportFactory;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final b0 getAppContext() {
            return FirebaseSessionsRegistrar.appContext;
        }

        public final b0 getBackgroundDispatcher() {
            return FirebaseSessionsRegistrar.backgroundDispatcher;
        }

        public final b0 getBlockingDispatcher() {
            return FirebaseSessionsRegistrar.blockingDispatcher;
        }

        public final b0 getFirebaseApp() {
            return FirebaseSessionsRegistrar.firebaseApp;
        }

        public final b0 getFirebaseInstallationsApi() {
            return FirebaseSessionsRegistrar.firebaseInstallationsApi;
        }

        public final b0 getFirebaseSessionsComponent() {
            return FirebaseSessionsRegistrar.firebaseSessionsComponent;
        }

        public final b0 getTransportFactory() {
            return FirebaseSessionsRegistrar.transportFactory;
        }
    }

    static {
        b0 b0VarUnqualified = b0.unqualified(Context.class);
        e0.checkNotNullExpressionValue(b0VarUnqualified, "unqualified(...)");
        appContext = b0VarUnqualified;
        b0 b0VarUnqualified2 = b0.unqualified(g.class);
        e0.checkNotNullExpressionValue(b0VarUnqualified2, "unqualified(...)");
        firebaseApp = b0VarUnqualified2;
        b0 b0VarUnqualified3 = b0.unqualified(f.class);
        e0.checkNotNullExpressionValue(b0VarUnqualified3, "unqualified(...)");
        firebaseInstallationsApi = b0VarUnqualified3;
        b0 b0VarQualified = b0.qualified(ai.a.class, CoroutineDispatcher.class);
        e0.checkNotNullExpressionValue(b0VarQualified, "qualified(...)");
        backgroundDispatcher = b0VarQualified;
        b0 b0VarQualified2 = b0.qualified(b.class, CoroutineDispatcher.class);
        e0.checkNotNullExpressionValue(b0VarQualified2, "qualified(...)");
        blockingDispatcher = b0VarQualified2;
        b0 b0VarUnqualified4 = b0.unqualified(l.class);
        e0.checkNotNullExpressionValue(b0VarUnqualified4, "unqualified(...)");
        transportFactory = b0VarUnqualified4;
        b0 b0VarUnqualified5 = b0.unqualified(x.class);
        e0.checkNotNullExpressionValue(b0VarUnqualified5, "unqualified(...)");
        firebaseSessionsComponent = b0VarUnqualified5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ek.u getComponents$lambda$0(d dVar) {
        return ((k) ((x) dVar.get(firebaseSessionsComponent))).getFirebaseSessions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x getComponents$lambda$1(d dVar) {
        v vVarBuilder = ek.l.builder();
        Object obj = dVar.get(appContext);
        e0.checkNotNullExpressionValue(obj, "get(...)");
        v vVarAppContext = ((j) vVarBuilder).appContext((Context) obj);
        Object obj2 = dVar.get(backgroundDispatcher);
        e0.checkNotNullExpressionValue(obj2, "get(...)");
        v vVarBackgroundDispatcher = ((j) vVarAppContext).backgroundDispatcher((m) obj2);
        Object obj3 = dVar.get(blockingDispatcher);
        e0.checkNotNullExpressionValue(obj3, "get(...)");
        v vVarBlockingDispatcher = ((j) vVarBackgroundDispatcher).blockingDispatcher((m) obj3);
        Object obj4 = dVar.get(firebaseApp);
        e0.checkNotNullExpressionValue(obj4, "get(...)");
        v vVarFirebaseApp = ((j) vVarBlockingDispatcher).firebaseApp((g) obj4);
        Object obj5 = dVar.get(firebaseInstallationsApi);
        e0.checkNotNullExpressionValue(obj5, "get(...)");
        v vVarFirebaseInstallationsApi = ((j) vVarFirebaseApp).firebaseInstallationsApi((f) obj5);
        c provider = dVar.getProvider(transportFactory);
        e0.checkNotNullExpressionValue(provider, "getProvider(...)");
        return ((j) ((j) vVarFirebaseInstallationsApi).transportFactoryProvider(provider)).build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bi.c> getComponents() {
        return p0.listOf((Object[]) new bi.c[]{bi.c.builder(ek.u.class).name(LIBRARY_NAME).add(q.required(firebaseSessionsComponent)).factory(new bk.b(5)).eagerInDefaultApp().build(), bi.c.builder(x.class).name("fire-sessions-component").add(q.required(appContext)).add(q.required(backgroundDispatcher)).add(q.required(blockingDispatcher)).add(q.required(firebaseApp)).add(q.required(firebaseInstallationsApi)).add(q.requiredProvider(transportFactory)).factory(new bk.b(6)).build(), i.create(LIBRARY_NAME, "3.0.3")});
    }
}
