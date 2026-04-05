package com.digidust.elokence.akinator.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import o9.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class PopuVipActivity extends AkActivity {
    public static final /* synthetic */ int C = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_popu_vip);
        ImageView imageView = (ImageView) findViewById(R.id.imageFlecheDroite);
        if (imageView != null) {
            imageView.setOnClickListener(new j0(this, 5));
        }
        View viewFindViewById = findViewById(R.id.textAwardPart1);
        e0.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.textAwardPart2);
        e0.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        AkApplication.a aVar = AkApplication.f21719f;
        textView.setTypeface(aVar.getTypeFace());
        textView2.setTypeface(aVar.getTypeFace());
        View viewFindViewById3 = findViewById(R.id.mainImage);
        e0.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById3;
        String stringExtra = getIntent().getStringExtra("mode");
        if (e0.areEqual(stringExtra, "fullAccess")) {
            b1.a aVar2 = b1.f72741d;
            textView.setText(aVar2.sharedInstance().getTraductionFromToken("TEXT1_FULL_ACCESS_VIP"));
            textView2.setText(aVar2.sharedInstance().getTraductionFromToken("TEXT2_FULL_ACCESS_VIP"));
            imageView2.setImageDrawable(m3.a.getDrawable(this, R.drawable.vip_full_pass));
            return;
        }
        if (e0.areEqual(stringExtra, "prog")) {
            b1.a aVar3 = b1.f72741d;
            textView.setText(aVar3.sharedInstance().getTraductionFromToken("TEXT1_+5000_VIP"));
            textView2.setText(aVar3.sharedInstance().getTraductionFromToken("TEXT2_+5000_VIP"));
            imageView2.setImageDrawable(m3.a.getDrawable(this, R.drawable.vip_5000_pass));
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
