package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.d;
import com.applovin.impl.o2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class q extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f15093a;

    /* renamed from: b, reason: collision with root package name */
    private p2 f15094b;

    /* renamed from: c, reason: collision with root package name */
    private List f15095c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15096d;

    /* renamed from: e, reason: collision with root package name */
    private ListView f15097e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends p2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f15098e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f15098e = list;
        }

        @Override // com.applovin.impl.p2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.p2
        public List c(int i10) {
            return q.this.f15095c;
        }

        @Override // com.applovin.impl.p2
        public int d(int i10) {
            return this.f15098e.size();
        }

        @Override // com.applovin.impl.p2
        public o2 e(int i10) {
            return new t4("");
        }
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f15093a;
    }

    public void initialize(List<n> list, boolean z10, com.applovin.impl.sdk.k kVar) {
        this.f15096d = z10;
        this.f15093a = kVar;
        this.f15095c = a(list);
        a aVar = new a(this, list);
        this.f15094b = aVar;
        aVar.a(new ao.q0(this, 5, list, kVar));
        this.f15094b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.f15096d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f15097e = listView;
        listView.setAdapter((ListAdapter) this.f15094b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.k kVar, i2 i2Var, o2 o2Var) {
        final n nVar = (n) list.get(i2Var.a());
        if (nVar.g().size() == 1) {
            final int i10 = 0;
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.w9
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    switch (i10) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(nVar, null, null, kVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(nVar, kVar);
                            break;
                    }
                }
            });
        } else {
            final int i11 = 1;
            d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.w9
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    switch (i11) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(nVar, null, null, kVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(nVar, kVar);
                            break;
                    }
                }
            });
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.c(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.b(), -16777216));
            arrayList.add(o2.a(o2.c.DETAIL).b(StringUtils.createSpannedString(nVar.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
