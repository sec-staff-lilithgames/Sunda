package o5;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.room.MultiInstanceInvalidationService;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f77621a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77622b;

    /* renamed from: c, reason: collision with root package name */
    public final y5.f f77623c;

    /* renamed from: d, reason: collision with root package name */
    public final y0.d f77624d;

    /* renamed from: e, reason: collision with root package name */
    public final List f77625e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f77626f;

    /* renamed from: g, reason: collision with root package name */
    public final z0 f77627g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f77628h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f77629i;

    /* renamed from: j, reason: collision with root package name */
    public final Intent f77630j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f77631k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f77632l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f77633m;

    /* renamed from: n, reason: collision with root package name */
    public final String f77634n;

    /* renamed from: o, reason: collision with root package name */
    public final File f77635o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f77636p;

    /* renamed from: q, reason: collision with root package name */
    public final y0.e f77637q;

    /* renamed from: r, reason: collision with root package name */
    public final List f77638r;

    /* renamed from: s, reason: collision with root package name */
    public final List f77639s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f77640t;

    /* renamed from: u, reason: collision with root package name */
    public final x5.c f77641u;

    /* renamed from: v, reason: collision with root package name */
    public final zu.m f77642v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f77643w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f77644x;

    public l(Context context, String str, y5.f fVar, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, y0.e eVar, List<? extends Object> typeConverters, List<? extends s5.a> autoMigrationSpecs, boolean z13, x5.c cVar, zu.m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverters, "typeConverters");
        kotlin.jvm.internal.e0.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f77621a = context;
        this.f77622b = str;
        this.f77623c = fVar;
        this.f77624d = migrationContainer;
        this.f77625e = list;
        this.f77626f = z10;
        this.f77627g = journalMode;
        this.f77628h = queryExecutor;
        this.f77629i = transactionExecutor;
        this.f77630j = intent;
        this.f77631k = z11;
        this.f77632l = z12;
        this.f77633m = set;
        this.f77634n = str2;
        this.f77635o = file;
        this.f77636p = callable;
        this.f77637q = eVar;
        this.f77638r = typeConverters;
        this.f77639s = autoMigrationSpecs;
        this.f77640t = z13;
        this.f77641u = cVar;
        this.f77642v = mVar;
        this.f77643w = intent != null;
        this.f77644x = true;
    }

    public static /* synthetic */ l copy$default(l lVar, Context context, String str, y5.f fVar, y0.d dVar, List list, boolean z10, z0 z0Var, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, y0.e eVar, List list2, List list3, boolean z13, x5.c cVar, zu.m mVar, int i10, Object obj) {
        zu.m mVar2;
        x5.c cVar2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        Context context2 = (i10 & 1) != 0 ? lVar.f77621a : context;
        String str3 = (i10 & 2) != 0 ? lVar.f77622b : str;
        y5.f fVar2 = (i10 & 4) != 0 ? lVar.f77623c : fVar;
        y0.d dVar2 = (i10 & 8) != 0 ? lVar.f77624d : dVar;
        List list4 = (i10 & 16) != 0 ? lVar.f77625e : list;
        boolean z14 = (i10 & 32) != 0 ? lVar.f77626f : z10;
        z0 z0Var2 = (i10 & 64) != 0 ? lVar.f77627g : z0Var;
        Executor executor3 = (i10 & 128) != 0 ? lVar.f77628h : executor;
        Executor executor4 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? lVar.f77629i : executor2;
        Intent intent2 = (i10 & 512) != 0 ? lVar.f77630j : intent;
        boolean z15 = (i10 & 1024) != 0 ? lVar.f77631k : z11;
        boolean z16 = (i10 & 2048) != 0 ? lVar.f77632l : z12;
        Set set2 = (i10 & 4096) != 0 ? lVar.f77633m : set;
        String str4 = (i10 & Segment.SIZE) != 0 ? lVar.f77634n : str2;
        Context context3 = context2;
        File file2 = (i10 & 16384) != 0 ? lVar.f77635o : file;
        Callable callable2 = (i10 & 32768) != 0 ? lVar.f77636p : callable;
        y0.e eVar2 = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? lVar.f77637q : eVar;
        List list5 = (i10 & 131072) != 0 ? lVar.f77638r : list2;
        List list6 = (i10 & 262144) != 0 ? lVar.f77639s : list3;
        boolean z17 = (i10 & 524288) != 0 ? lVar.f77640t : z13;
        x5.c cVar3 = (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? lVar.f77641u : cVar;
        if ((i10 & 2097152) != 0) {
            cVar2 = cVar3;
            mVar2 = lVar.f77642v;
        } else {
            mVar2 = mVar;
            cVar2 = cVar3;
        }
        return lVar.copy(context3, str3, fVar2, dVar2, list4, z14, z0Var2, executor3, executor4, intent2, z15, z16, set2, str4, file2, callable2, eVar2, list5, list6, z17, cVar2, mVar2);
    }

    public final l copy(Context context, String str, y5.f fVar, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, y0.e eVar, List<? extends Object> typeConverters, List<? extends s5.a> autoMigrationSpecs, boolean z13, x5.c cVar, zu.m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverters, "typeConverters");
        kotlin.jvm.internal.e0.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new l(context, str, fVar, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, eVar, typeConverters, autoMigrationSpecs, z13, cVar, mVar);
    }

    public final Set<Integer> getMigrationNotRequiredFrom$room_runtime_release() {
        return this.f77633m;
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
        return this.f77644x;
    }

    public boolean isMigrationRequired(int i10, int i11) {
        return u5.n.isMigrationRequired(this, i10, i11);
    }

    @tu.f
    public boolean isMigrationRequiredFrom(int i10) {
        return isMigrationRequired(i10, i10 + 1);
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z10) {
        this.f77644x = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(Context context, String str, y5.f sqliteOpenHelperFactory, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, boolean z11, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, queryExecutor, null, z11, false, set, null, null, null, null, uu.p0.emptyList(), uu.p0.emptyList(), false, null, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(Context context, String str, y5.f sqliteOpenHelperFactory, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, null, null, null, null, uu.p0.emptyList(), uu.p0.emptyList(), false, null, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(Context context, String str, y5.f sqliteOpenHelperFactory, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, null, null, uu.p0.emptyList(), uu.p0.emptyList(), false, null, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(Context context, String str, y5.f sqliteOpenHelperFactory, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, null, uu.p0.emptyList(), uu.p0.emptyList(), false, null, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(Context context, String str, y5.f sqliteOpenHelperFactory, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable, y0.e eVar) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, eVar, uu.p0.emptyList(), uu.p0.emptyList(), false, null, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(Context context, String str, y5.f sqliteOpenHelperFactory, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable, y0.e eVar, List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, eVar, typeConverters, uu.p0.emptyList(), false, null, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(Context context, String str, y5.f sqliteOpenHelperFactory, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable, y0.e eVar, List<? extends Object> typeConverters, List<? extends s5.a> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, false, null, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverters, "typeConverters");
        kotlin.jvm.internal.e0.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(Context context, String str, y5.f sqliteOpenHelperFactory, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, y0.e eVar, List<? extends Object> typeConverters, List<? extends s5.a> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, false, null, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverters, "typeConverters");
        kotlin.jvm.internal.e0.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(Context context, String str, y5.f sqliteOpenHelperFactory, y0.d migrationContainer, List<? extends y0.b> list, boolean z10, z0 journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, y0.e eVar, List<? extends Object> typeConverters, List<? extends s5.a> autoMigrationSpecs, boolean z13) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, z13, null, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverters, "typeConverters");
        kotlin.jvm.internal.e0.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
