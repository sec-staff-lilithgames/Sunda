package com.amazon.device.ads;

import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import com.iab.omid.library.amazon.adsession.CreativeType;
import com.iab.omid.library.amazon.adsession.Owner;
import java.util.List;
import java.util.Set;
import v6.b0;
import v6.c0;
import v6.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12550b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12551c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12555h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12556i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f12557j;

    public /* synthetic */ m(WorkDatabase workDatabase, b0 b0Var, b0 b0Var2, List list, String str, Set set, boolean z10) {
        this.f12553f = workDatabase;
        this.f12554g = b0Var;
        this.f12555h = b0Var2;
        this.f12556i = list;
        this.f12551c = str;
        this.f12557j = set;
        this.f12552e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12550b) {
            case 0:
                ((DtbOmSdkSessionManager) this.f12553f).lambda$initOmAdSession$2((CreativeType) this.f12554g, (Owner) this.f12555h, (Owner) this.f12556i, this.f12552e, (WebView) this.f12557j, this.f12551c);
                break;
            default:
                WorkDatabase workDatabase = (WorkDatabase) this.f12553f;
                b0 b0Var = (b0) this.f12554g;
                b0 b0Var2 = (b0) this.f12555h;
                List list = (List) this.f12556i;
                Set<String> set = (Set) this.f12557j;
                c0 c0VarWorkSpecDao = workDatabase.workSpecDao();
                p0 p0VarWorkTagDao = workDatabase.workTagDao();
                b0 b0VarCopy$default = b0.copy$default(b0Var2, null, b0Var.f89054b, null, null, null, null, 0L, 0L, 0L, null, b0Var.f89063k, null, 0L, b0Var.f89066n, 0L, 0L, false, null, b0Var.getPeriodCount(), b0Var.getGeneration() + 1, b0Var.getNextScheduleTimeOverride(), b0Var.getNextScheduleTimeOverrideGeneration(), 0, null, null, 29613053, null);
                if (b0Var2.getNextScheduleTimeOverrideGeneration() == 1) {
                    b0VarCopy$default.setNextScheduleTimeOverride(b0Var2.getNextScheduleTimeOverride());
                    b0VarCopy$default.setNextScheduleTimeOverrideGeneration(b0VarCopy$default.getNextScheduleTimeOverrideGeneration() + 1);
                }
                c0VarWorkSpecDao.updateWorkSpec(w6.g.wrapWorkSpecIfNeeded(list, b0VarCopy$default));
                String str = this.f12551c;
                p0VarWorkTagDao.deleteByWorkSpecId(str);
                p0VarWorkTagDao.insertTags(str, set);
                if (!this.f12552e) {
                    c0VarWorkSpecDao.markWorkSpecScheduled(str, -1L);
                    workDatabase.workProgressDao().delete(str);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m(DtbOmSdkSessionManager dtbOmSdkSessionManager, CreativeType creativeType, Owner owner, Owner owner2, boolean z10, WebView webView, String str) {
        this.f12553f = dtbOmSdkSessionManager;
        this.f12554g = creativeType;
        this.f12555h = owner;
        this.f12556i = owner2;
        this.f12552e = z10;
        this.f12557j = webView;
        this.f12551c = str;
    }
}
