package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.d;
import com.applovin.impl.o2;
import com.applovin.impl.p2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class p extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private n f15005a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f15006b;

    /* renamed from: c, reason: collision with root package name */
    private p2 f15007c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends p2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f15008e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, n nVar) {
            super(context);
            this.f15008e = nVar;
        }

        @Override // com.applovin.impl.p2
        public int b() {
            return this.f15008e.g().size();
        }

        @Override // com.applovin.impl.p2
        public List c(int i10) {
            ArrayList arrayList = new ArrayList();
            o oVar = (o) this.f15008e.g().get(i10);
            arrayList.add(p.this.c(oVar.c()));
            if (oVar.b() != null) {
                arrayList.add(p.this.a("AB Test Experiment Name", oVar.b()));
            }
            h8 h8VarD = oVar.d();
            p pVar = p.this;
            arrayList.add(pVar.a("Device ID Targeting", pVar.a(h8VarD.a())));
            p pVar2 = p.this;
            arrayList.add(pVar2.a("Device Type Targeting", pVar2.b(h8VarD.b())));
            if (h8VarD.c() != null) {
                arrayList.add(p.this.a(h8VarD.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.p2
        public int d(int i10) {
            o oVar = (o) this.f15008e.g().get(i10);
            return (oVar.b() != null ? 1 : 0) + 3 + (oVar.d().c() != null ? 1 : 0);
        }

        @Override // com.applovin.impl.p2
        public o2 e(int i10) {
            return i10 == b.TARGETED_WATERFALL.ordinal() ? new t4("TARGETED WATERFALL FOR CURRENT DEVICE") : i10 == b.OTHER_WATERFALLS.ordinal() ? new t4("OTHER WATERFALLS") : new t4("");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f15006b;
    }

    public void initialize(n nVar, com.applovin.impl.sdk.k kVar) {
        this.f15005a = nVar;
        this.f15006b = kVar;
        a aVar = new a(this, nVar);
        this.f15007c = aVar;
        aVar.a(new ao.q0(this, 2, kVar, nVar));
        this.f15007c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f15005a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f15007c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        p2 p2Var = this.f15007c;
        if (p2Var != null) {
            p2Var.a((p2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        if (str.equals("tablet")) {
            return "Tablets";
        }
        return "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o2 c(String str) {
        return o2.a(o2.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final n nVar, final i2 i2Var, o2 o2Var) {
        if (i2Var.a() == 0) {
            final int i10 = 0;
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.v9
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    switch (i10) {
                        case 0:
                            p.a(nVar, i2Var, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            p.a(nVar, i2Var, kVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            break;
                    }
                }
            });
        } else {
            final int i11 = 1;
            d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.v9
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    switch (i11) {
                        case 0:
                            p.a(nVar, i2Var, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            p.a(nVar, i2Var, kVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar, i2 i2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, (o) nVar.g().get(i2Var.b()), null, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar, i2 i2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        o oVar = (o) nVar.g().get(i2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(oVar.c(), oVar.d().c(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o2 a(String str, String str2) {
        return o2.a(o2.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o2 a(List list) {
        return o2.a(o2.c.DETAIL).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }
}
