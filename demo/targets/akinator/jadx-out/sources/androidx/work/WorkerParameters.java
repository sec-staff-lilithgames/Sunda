package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import n6.e1;
import n6.p;
import n6.q0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f7424a;

    /* renamed from: b, reason: collision with root package name */
    public final b f7425b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f7426c;

    /* renamed from: d, reason: collision with root package name */
    public final a f7427d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7428e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f7429f;

    /* renamed from: g, reason: collision with root package name */
    public final m f7430g;

    /* renamed from: h, reason: collision with root package name */
    public final x6.b f7431h;

    /* renamed from: i, reason: collision with root package name */
    public final e1 f7432i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f7433j;

    /* renamed from: k, reason: collision with root package name */
    public final p f7434k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7435l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List f7436a;

        /* renamed from: b, reason: collision with root package name */
        public List f7437b;

        /* renamed from: c, reason: collision with root package name */
        public Network f7438c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f7436a = list;
            this.f7437b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, int i11, Executor executor, m mVar, x6.b bVar2, e1 e1Var, q0 q0Var, p pVar) {
        this.f7424a = uuid;
        this.f7425b = bVar;
        this.f7426c = new HashSet(collection);
        this.f7427d = aVar;
        this.f7428e = i10;
        this.f7435l = i11;
        this.f7429f = executor;
        this.f7430g = mVar;
        this.f7431h = bVar2;
        this.f7432i = e1Var;
        this.f7433j = q0Var;
        this.f7434k = pVar;
    }

    public Executor getBackgroundExecutor() {
        return this.f7429f;
    }

    public p getForegroundUpdater() {
        return this.f7434k;
    }

    public int getGeneration() {
        return this.f7435l;
    }

    public UUID getId() {
        return this.f7424a;
    }

    public b getInputData() {
        return this.f7425b;
    }

    public Network getNetwork() {
        return this.f7427d.f7438c;
    }

    public q0 getProgressUpdater() {
        return this.f7433j;
    }

    public int getRunAttemptCount() {
        return this.f7428e;
    }

    public a getRuntimeExtras() {
        return this.f7427d;
    }

    public Set<String> getTags() {
        return this.f7426c;
    }

    public x6.b getTaskExecutor() {
        return this.f7431h;
    }

    public List<String> getTriggeredContentAuthorities() {
        return this.f7427d.f7436a;
    }

    public List<Uri> getTriggeredContentUris() {
        return this.f7427d.f7437b;
    }

    public m getWorkerContext() {
        return this.f7430g;
    }

    public e1 getWorkerFactory() {
        return this.f7432i;
    }
}
