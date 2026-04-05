package ek;

import android.content.Context;
import android.os.Build;
import j1.o2;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import k4.h2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ w f54661a = new w();

    public static k4.n a(w wVar, h2 h2Var, l4.b bVar, CoroutineScope coroutineScope, kv.a aVar) {
        List<? extends k4.h> listEmptyList = uu.p0.emptyList();
        try {
            System.loadLibrary("datastore_shared_counter");
            return k4.x1.f70559a.create(h2Var, bVar, listEmptyList, coroutineScope, aVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return k4.o.f70432a.create(h2Var, bVar, listEmptyList, coroutineScope, aVar);
        }
    }

    public static void b(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && kotlin.jvm.internal.e0.areEqual(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            throw new IOException(o2.h(parentFile, "Failed to delete conflicting file: "));
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
            } catch (Exception e10) {
                throw new IOException(o2.h(parentFile, "Failed to create directory: "), e10);
            }
        } else if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException(o2.h(parentFile, "Failed to create directory: "));
        }
    }

    public final b applicationInfo(com.google.firebase.g firebaseApp) {
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseApp, "firebaseApp");
        return z0.f54684a.getApplicationInfo(firebaseApp);
    }

    public final k4.n sessionConfigsDataStore(Context appContext, @ai.b zu.m blockingDispatcher) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.e0.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        return a(this, ik.n.f59708a, new l4.b(new a1.o(27)), CoroutineScopeKt.CoroutineScope(blockingDispatcher), new com.moloco.sdk.internal.publisher.nativead.parser.c(appContext, 1));
    }

    public final k4.n sessionDataStore(Context appContext, @ai.b zu.m blockingDispatcher, u0 sessionDataSerializer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.e0.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDataSerializer, "sessionDataSerializer");
        return a(this, sessionDataSerializer, new l4.b(new aw.f(sessionDataSerializer, 15)), CoroutineScopeKt.CoroutineScope(blockingDispatcher), new com.moloco.sdk.internal.publisher.nativead.parser.c(appContext, 2));
    }

    public final z1 timeProvider() {
        return a2.f54456a;
    }

    public final b2 uuidGenerator() {
        return c2.f54486a;
    }
}
