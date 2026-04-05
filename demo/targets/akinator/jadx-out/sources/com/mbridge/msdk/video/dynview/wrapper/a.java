package com.mbridge.msdk.video.dynview.wrapper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.device.ads.DTBMetricReport;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.video.dynview.shape.a;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: m, reason: collision with root package name */
    private static boolean f44534m = false;

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.b f44535a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Bitmap> f44536b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f44537c;

    /* renamed from: d, reason: collision with root package name */
    private String f44538d = "#FFFFFFFF";

    /* renamed from: e, reason: collision with root package name */
    private String f44539e = "#60000000";

    /* renamed from: f, reason: collision with root package name */
    private String f44540f = "#FF5F5F5F";

    /* renamed from: g, reason: collision with root package name */
    private String f44541g = "#90ECECEC";

    /* renamed from: h, reason: collision with root package name */
    private volatile long f44542h = 0;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f44543i = null;

    /* renamed from: j, reason: collision with root package name */
    private boolean f44544j = false;

    /* renamed from: k, reason: collision with root package name */
    private int f44545k = 0;

    /* renamed from: l, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.inter.a f44546l = new c();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.video.dynview.wrapper.a$a, reason: collision with other inner class name */
    public class C0348a implements com.mbridge.msdk.video.dynview.util.time.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f44547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44548b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f44549c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map f44550d;

        public C0348a(TextView textView, String str, CampaignEx campaignEx, Map map) {
            this.f44547a = textView;
            this.f44548b = str;
            this.f44549c = campaignEx;
            this.f44550d = map;
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.a
        public void onFinish() {
            this.f44549c.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.f40950c);
            a.this.b(this.f44550d);
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.a
        public void onTick(long j10) {
            a.this.f44545k = (int) (j10 / 1000);
            this.f44547a.setText(com.mbridge.msdk.video.dynview.util.a.a(a.this.f44545k, this.f44547a.getContext()));
            a.this.f44542h++;
            if (TextUtils.isEmpty(this.f44548b) || !this.f44548b.equals("1")) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", "choseFromTwoHeartbeat");
            eVar.a("xtSecond", "countTimeForReport");
            eVar.a("autoPlayCountDownTime", "mLeftOverCountTime");
            com.mbridge.msdk.video.module.report.a.a("2000103", this.f44549c, eVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements com.mbridge.msdk.video.dynview.inter.a {
        public c() {
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void a() {
            if (!a.this.f44544j || a.this.f44535a == null) {
                return;
            }
            a.this.f44535a.a(a.this.f44545k * 1000, a.this.f44543i);
            a.this.f44544j = false;
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void b() {
            if (a.this.f44535a != null) {
                a.this.f44535a.a();
                a.this.f44544j = true;
            }
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void c() {
            if (a.this.f44535a != null) {
                a.this.f44535a.a();
                a.this.f44544j = true;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends com.mbridge.msdk.widget.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f44554b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f44555c;

        public d(Map map, List list) {
            this.f44554b = map;
            this.f44555c = list;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (a.this.f44537c) {
                return;
            }
            a.this.f44537c = true;
            a.this.a(this.f44554b, (List<CampaignEx>) this.f44555c, 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends com.mbridge.msdk.widget.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f44557b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f44558c;

        public e(Map map, List list) {
            this.f44557b = map;
            this.f44558c = list;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (a.this.f44537c) {
                return;
            }
            a.this.f44537c = true;
            a.this.a(this.f44557b, (List<CampaignEx>) this.f44558c, 1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f44560a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f44561b;

        public f(Map map, List list) {
            this.f44560a = map;
            this.f44561b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a.this.a(this.f44560a, (List<CampaignEx>) this.f44561b, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f44563a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f44564b;

        public g(Map map, List list) {
            this.f44563a = map;
            this.f44564b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a.this.a(this.f44563a, (List<CampaignEx>) this.f44564b, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f44566a;

        public h(Map map) {
            this.f44566a = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.a(this.f44566a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f44569b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a, reason: collision with other inner class name */
        public class RunnableC0349a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f44571a;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a$a, reason: collision with other inner class name */
            public class RunnableC0350a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Bitmap f44573a;

                public RunnableC0350a(Bitmap bitmap) {
                    this.f44573a = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    i.this.f44569b.setImageBitmap(this.f44573a);
                }
            }

            public RunnableC0349a(Bitmap bitmap) {
                this.f44571a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    i.this.f44569b.post(new RunnableC0350a(z.a(this.f44571a, 10)));
                } catch (Exception e10) {
                    p0.b("DataEnergizeWrapper", e10.getMessage());
                }
            }
        }

        public i(int i10, ImageView imageView) {
            this.f44568a = i10;
            this.f44569b = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            try {
                int iA = h0.a(this.f44569b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f44569b.setBackgroundColor(Color.parseColor(a.this.f44540f));
                this.f44569b.setImageResource(iA);
                this.f44569b.setScaleType(ImageView.ScaleType.CENTER);
            } catch (Exception e10) {
                p0.a("DataEnergizeWrapper", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                int iA = h0.a(this.f44569b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f44569b.setBackgroundColor(Color.parseColor(a.this.f44540f));
                this.f44569b.setImageResource(iA);
                this.f44569b.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            int i10 = this.f44568a;
            if (i10 != 501 && i10 != 802) {
                this.f44569b.setImageBitmap(bitmap);
            } else {
                com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0349a(bitmap));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k extends com.mbridge.msdk.widget.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f44580b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f44581c;

        public k(CampaignEx campaignEx, Map map) {
            this.f44580b = campaignEx;
            this.f44581c = map;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (a.this.f44537c) {
                return;
            }
            a.this.f44537c = true;
            this.f44580b.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.f40951d);
            a.this.b(this.f44581c);
        }
    }

    public void c(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        try {
            if (this.f44536b == null) {
                this.f44536b = new HashMap();
            }
            List<CampaignEx> listB = cVar.b();
            if (view.getContext() == null) {
                eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f44534m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            for (CampaignEx campaignEx : listB) {
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(f44534m);
                }
            }
            ListView listView = (ListView) view.findViewById(a(f44534m, "mbridge_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(a(f44534m, "mbridge_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(a(f44534m, "mbridge_order_view_iv_close"));
            com.mbridge.msdk.video.dynview.ordercamp.adapter.a aVar = new com.mbridge.msdk.video.dynview.ordercamp.adapter.a(listB);
            if (cVar.h() == 1) {
                if (listView != null) {
                    a(listView, cVar);
                    listView.setAdapter((ListAdapter) aVar);
                    listView.setOnItemClickListener(new f(map, listB));
                }
            } else if (gridView != null) {
                int iM = (int) cVar.m();
                int size = iM / listB.size();
                int i10 = size / 9;
                int i11 = i10 / 2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams.width = iM - (i10 * 2);
                gridView.setLayoutParams(layoutParams);
                gridView.setColumnWidth((size - i10) - (i11 / 2));
                gridView.setHorizontalSpacing(i11);
                gridView.setStretchMode(0);
                gridView.setNumColumns(listB.size());
                gridView.setAdapter((ListAdapter) aVar);
                gridView.setOnItemClickListener(new g(map, listB));
            }
            if (imageView != null) {
                imageView.setOnClickListener(new h(map));
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.foundation.feedback.a {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            if (a.this.f44535a != null) {
                a.this.f44535a.a();
                a.this.f44544j = true;
            }
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            if (!a.this.f44544j || a.this.f44535a == null) {
                return;
            }
            a.this.f44535a.a(a.this.f44545k * 1000, a.this.f44543i);
            a.this.f44544j = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            if (!a.this.f44544j || a.this.f44535a == null) {
                return;
            }
            a.this.f44535a.a(a.this.f44545k * 1000, a.this.f44543i);
            a.this.f44544j = false;
        }
    }

    public void b(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f44534m = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        boolean z10 = f44534m;
        LinearLayout linearLayout = z10 ? (LinearLayout) view.findViewById(a(z10, "mbridge_reward_heat_mllv")) : null;
        ImageView imageView = (ImageView) view.findViewById(a(f44534m, "mbridge_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(a(f44534m, "mbridge_reward_title_tv"));
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(a(f44534m, "mbridge_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(a(f44534m, "mbridge_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(a(f44534m, "mbridge_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(a(f44534m, "mbridge_reward_desc_tv"));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(f44534m, "mbridge_reward_bottom_layout"));
        ArrayList arrayList = new ArrayList();
        List<CampaignEx> listB = cVar.b();
        if (listB != null && listB.size() > 0) {
            CampaignEx campaignEx = listB.get(0);
            if (campaignEx != null) {
                if (imageView != null) {
                    if (f44534m) {
                        if (imageView instanceof MBCusRoundImageView) {
                            ((MBCusRoundImageView) imageView).setCustomBorder(30, 30, 30, 30, 10, -1);
                        }
                    } else {
                        ((RoundImageView) imageView).setBorderRadius(10);
                    }
                    a(campaignEx.getIconUrl(), imageView);
                }
                if (textView != null) {
                    textView.setText(campaignEx.getAppName());
                }
                if (textView3 != null) {
                    textView3.setText(campaignEx.getAppDesc());
                }
                if (linearLayout2 != null) {
                    double rating = campaignEx.getRating();
                    if (rating <= 0.0d) {
                        rating = 5.0d;
                    }
                    if (f44534m) {
                        if (linearLayout2 instanceof MBStarLevelLayoutView) {
                            MBStarLevelLayoutView mBStarLevelLayoutView = (MBStarLevelLayoutView) linearLayout2;
                            mBStarLevelLayoutView.setRating((int) rating);
                            mBStarLevelLayoutView.setOrientation(0);
                        }
                        if (linearLayout instanceof MBHeatLevelLayoutView) {
                            ((MBHeatLevelLayoutView) linearLayout).setHeatCount(campaignEx.getNumberRating());
                        }
                    } else {
                        ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, campaignEx.getNumberRating());
                    }
                }
                if (textView2 != null) {
                    textView2.setText(campaignEx.getAdCall());
                }
                int iL = cVar.l();
                if (iL == 102 || iL == 202 || iL == 302) {
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                } else if (iL == 802) {
                    if (imageView != null) {
                        arrayList.add(imageView);
                    }
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                    a(imageView2, campaignEx.getImageUrl(), iL);
                } else if (iL != 902) {
                    if (iL != 904) {
                        if (iL == 5002010) {
                            if (cVar.p() && relativeLayout != null && relativeLayout.getVisibility() == 0) {
                                arrayList.add(relativeLayout);
                            } else {
                                if (imageView != null) {
                                    arrayList.add(imageView);
                                }
                                if (textView2 != null) {
                                    arrayList.add(textView2);
                                }
                            }
                        }
                    } else if (cVar.p()) {
                        arrayList.add(view);
                    }
                } else if (TextUtils.isEmpty(cVar.n()) || !cVar.n().equals("dsp") || !TextUtils.isEmpty(campaignEx.getClickURL())) {
                    arrayList.add(view);
                }
                eVar.a(view, arrayList);
                return;
            }
            eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.mbridge.msdk.video.dynview.c r35, android.view.View r36, java.util.Map r37, com.mbridge.msdk.video.dynview.listener.e r38) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.wrapper.a.a(com.mbridge.msdk.video.dynview.c, android.view.View, java.util.Map, com.mbridge.msdk.video.dynview.listener.e):void");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f44575a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44576b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.dynview.c f44577c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f44578d;

        public j(ImageView imageView, String str, com.mbridge.msdk.video.dynview.c cVar, View view) {
            this.f44575a = imageView;
            this.f44576b = str;
            this.f44577c = cVar;
            this.f44578d = view;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ImageView imageView;
            if (bitmap == null || bitmap.isRecycled() || (imageView = this.f44575a) == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
            if (a.this.f44536b != null) {
                a.this.f44536b.put(SameMD5.getMD5(this.f44576b), bitmap);
                a.this.a(this.f44577c, this.f44578d);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof com.mbridge.msdk.video.dynview.listener.d)) {
                    ((com.mbridge.msdk.video.dynview.listener.d) map.get("choice_one_callback")).a();
                    b();
                }
            } catch (Exception e10) {
                p0.b("DataEnergizeWrapper", e10.getMessage());
            }
        }
    }

    private void b(com.mbridge.msdk.video.dynview.c cVar, View view) {
        a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
        bVarA.a(cVar.h()).a(true);
        if (cVar.h() != 2 || cVar.m() > cVar.k()) {
            bVarA.b(cVar.m()).a(cVar.k());
        } else {
            bVarA.b(cVar.k()).a(cVar.m());
        }
        if (view.getBackground() == null) {
            view.setBackground(bVarA.a());
        }
    }

    private void b() {
        com.mbridge.msdk.video.dynview.util.draw.a.a().b();
        com.mbridge.msdk.video.dynview.util.time.b bVar = this.f44535a;
        if (bVar != null) {
            bVar.a();
            this.f44535a = null;
        }
        com.mbridge.msdk.video.dynview.energize.a.a().f44396a = null;
        if (this.f44546l != null) {
            this.f44546l = null;
        }
        Map<String, Bitmap> map = this.f44536b;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f44536b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            this.f44536b.clear();
        }
    }

    public void a(com.mbridge.msdk.video.dynview.c cVar, View view, com.mbridge.msdk.video.dynview.listener.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_iv_adbanner_bg", "id"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.f44541g));
            }
            ImageView imageView2 = (ImageView) view.findViewById(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_iv_adbanner", "id"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.f44541g));
            }
            eVar.a(view, new ArrayList());
        } catch (Exception e10) {
            p0.a("DataEnergizeWrapper", e10.getMessage());
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(ImageView imageView, String str, int i10) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new i(i10, imageView));
    }

    private void a(String str, ImageView imageView, com.mbridge.msdk.video.dynview.c cVar, View view) {
        com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new j(imageView, str, cVar, view));
        try {
            Bitmap bitmapA = a();
            if (bitmapA == null || bitmapA.isRecycled()) {
                return;
            }
            b(cVar, view);
        } catch (Exception e10) {
            p0.b("DataEnergizeWrapper", e10.getMessage());
        }
    }

    private void a(String str, Context context, View view, int i10, Map map, CampaignEx campaignEx) {
        CampaignEx campaignEx2;
        String strA = b1.a(str, "cltp");
        String strA2 = b1.a(str, "xt");
        long j10 = !TextUtils.isEmpty(strA) ? Long.parseLong(strA) : 0L;
        if (j10 != 0) {
            if (map != null && map.containsKey("is_dy_success")) {
                f44534m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            TextView textView = (TextView) view.findViewById(a(f44534m, "mbridge_choice_one_countdown_tv"));
            if (textView != null) {
                textView.setTextSize(11.0f);
                textView.setTextColor(Color.parseColor(this.f44538d));
                String str2 = this.f44539e;
                com.mbridge.msdk.video.dynview.util.drawable.a.a(textView, 1, 12, str2, str2);
                textView.setVisibility(0);
                textView.setOnClickListener(new k(campaignEx, map));
                campaignEx2 = campaignEx;
                this.f44543i = new C0348a(textView, strA2, campaignEx2, map);
                com.mbridge.msdk.video.dynview.util.time.b bVarA = new com.mbridge.msdk.video.dynview.util.time.b().b(j10 * 1000).a(1000L).a(this.f44543i);
                this.f44535a = bVarA;
                bVarA.c();
            } else {
                campaignEx2 = campaignEx;
            }
            ImageView imageView = (ImageView) view.findViewById(a(f44534m, "mbridge_iv_link"));
            if (campaignEx2 == null) {
                return;
            }
            if (campaignEx2.getAdchoice() != null) {
                campaignEx2.getAdchoice().g("");
            }
            u0.a(4, imageView, campaignEx2, com.mbridge.msdk.foundation.controller.c.m().d(), false, new b());
        }
    }

    private void a(ListView listView, com.mbridge.msdk.video.dynview.c cVar) {
        if (listView == null || cVar == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = -1;
            float fK = (cVar.k() - u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 720.0f)) / 2.0f;
            int iA = u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 10.0f);
            int i10 = (int) fK;
            layoutParams.setMargins(iA, i10, iA, i10);
            listView.setLayoutParams(layoutParams);
        } catch (Exception e10) {
            p0.b("DataEnergizeWrapper", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map, List<CampaignEx> list, int i10) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof com.mbridge.msdk.video.dynview.listener.d)) {
            com.mbridge.msdk.video.dynview.listener.d dVar = (com.mbridge.msdk.video.dynview.listener.d) map.get("choice_one_callback");
            if (dVar != null) {
                dVar.a(list.get(i10));
                try {
                    CampaignEx campaignEx = list.get(i10);
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("click", "0");
                    eVar.a(DTBMetricReport.TIME, Long.valueOf(this.f44542h));
                    eVar.a("choose_cid", campaignEx.getId());
                    eVar.a(C3191e4.h.L, Integer.valueOf(i10));
                    eVar.a("type", "choseFromTwoSelect");
                    com.mbridge.msdk.video.module.report.a.a("2000103", campaignEx, eVar);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
            b();
            return;
        }
        if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.listener.c)) {
            com.mbridge.msdk.video.dynview.listener.c cVar = (com.mbridge.msdk.video.dynview.listener.c) map.get("order_view_callback");
            if (cVar != null) {
                cVar.a(list.get(i10), i10);
            }
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.listener.c)) {
                    ((com.mbridge.msdk.video.dynview.listener.c) map.get("order_view_callback")).close();
                    b();
                }
            } catch (Exception e10) {
                p0.b("DataEnergizeWrapper", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = this.f44536b;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(this.f44536b, cVar, view);
    }

    private int a(boolean z10, String str) {
        try {
            if (z10) {
                if (TextUtils.isEmpty(str)) {
                    return -1;
                }
                return str.hashCode();
            }
            return h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, "id");
        } catch (Exception e10) {
            p0.b("DataEnergizeWrapper", e10.getMessage());
            return -1;
        }
    }

    private Bitmap a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor(this.f44541g));
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return bitmapCreateBitmap;
        }
    }
}
