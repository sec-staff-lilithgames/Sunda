package com.digidust.elokence.akinator.activities.rarecharacter;

import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.paid.databinding.ActivityCongratsRareCharacterBinding;
import i.d;
import kotlin.jvm.internal.e0;
import o9.b3;
import on.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class CongratRareCharacterActivity extends AkActivity {
    public static final /* synthetic */ int G = 0;
    public ActivityCongratsRareCharacterBinding C;
    public boolean D;
    public final w E = new w(this, 20);
    public final d F = registerForActivityResult(new j.d(), new b3(this, 21));

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ActivityCongratsRareCharacterBinding activityCongratsRareCharacterBinding = this.C;
        if (activityCongratsRareCharacterBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityCongratsRareCharacterBinding = null;
        }
        activityCongratsRareCharacterBinding.mainLayout.removeCallbacks(this.E);
        super.onDestroy();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.view.LayoutInflater r6 = r5.getLayoutInflater()
            com.digidust.elokence.akinator.paid.databinding.ActivityCongratsRareCharacterBinding r6 = com.digidust.elokence.akinator.paid.databinding.ActivityCongratsRareCharacterBinding.inflate(r6)
            r5.C = r6
            java.lang.String r0 = "binding"
            r1 = 0
            if (r6 != 0) goto L16
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r0)
            r6 = r1
        L16:
            android.widget.RelativeLayout r6 = r6.getRoot()
            r5.setContentView(r6)
            ca.t r6 = ca.t.sharedInstance()     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L4a
            ca.m r2 = ca.m.sharedInstance()     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L4a
            lb.c r2 = r2.getCurrentInstance()     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L4a
            kotlin.jvm.internal.e0.checkNotNull(r2)     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L4a
            int r2 = r2.getSubjectId()     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L4a
            android.graphics.Bitmap r6 = r6.getSubjectBackground(r2)     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L4a
            goto L4b
        L35:
            lb.b1$a r6 = lb.b1.f72741d
            lb.b1 r6 = r6.sharedInstance()
            r2 = 0
            java.lang.String r2 = com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA.aASLefvSobeQamY
            java.lang.String r6 = r6.getTraductionFromToken(r2)
            r2 = 1
            android.widget.Toast r6 = android.widget.Toast.makeText(r5, r6, r2)
            r6.show()
        L4a:
            r6 = r1
        L4b:
            if (r6 == 0) goto L68
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r3 = r5.getResources()
            r2.<init>(r3, r6)
            r6 = 125(0x7d, float:1.75E-43)
            r2.setAlpha(r6)
            com.digidust.elokence.akinator.paid.databinding.ActivityCongratsRareCharacterBinding r6 = r5.C
            if (r6 != 0) goto L63
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r0)
            r6 = r1
        L63:
            android.widget.RelativeLayout r6 = r6.mainLayout
            r6.setBackground(r2)
        L68:
            com.digidust.elokence.akinator.paid.databinding.ActivityCongratsRareCharacterBinding r6 = r5.C
            if (r6 != 0) goto L70
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r0)
            r6 = r1
        L70:
            android.widget.TextView r6 = r6.titleExcellent
            com.digidust.elokence.akinator.factories.AkApplication$a r2 = com.digidust.elokence.akinator.factories.AkApplication.f21719f
            android.graphics.Typeface r3 = r2.getTypeFaceSatisfyReg()
            r6.setTypeface(r3)
            com.digidust.elokence.akinator.paid.databinding.ActivityCongratsRareCharacterBinding r6 = r5.C
            if (r6 != 0) goto L83
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r0)
            r6 = r1
        L83:
            android.widget.TextView r6 = r6.titleExcellent
            lb.b1$a r3 = lb.b1.f72741d
            java.lang.String r4 = "BLOCAGE_EXCELLENT_TITRE"
            j1.o2.A(r3, r4, r6)
            com.digidust.elokence.akinator.paid.databinding.ActivityCongratsRareCharacterBinding r6 = r5.C
            if (r6 != 0) goto L94
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r0)
            r6 = r1
        L94:
            android.widget.TextView r6 = r6.descriptionRareCharacter
            android.graphics.Typeface r2 = r2.getTypeFaceSatisfyReg()
            r6.setTypeface(r2)
            com.digidust.elokence.akinator.paid.databinding.ActivityCongratsRareCharacterBinding r6 = r5.C
            if (r6 != 0) goto La5
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r0)
            r6 = r1
        La5:
            android.widget.TextView r6 = r6.descriptionRareCharacter
            java.lang.String r2 = "BLOCAGE_EXCELLENT_TEXT"
            j1.o2.A(r3, r2, r6)
            com.digidust.elokence.akinator.paid.databinding.ActivityCongratsRareCharacterBinding r6 = r5.C
            if (r6 != 0) goto Lb4
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r0)
            r6 = r1
        Lb4:
            android.widget.RelativeLayout r6 = r6.mainLayout
            o9.j0 r2 = new o9.j0
            r3 = 13
            r2.<init>(r5, r3)
            r6.setOnClickListener(r2)
            com.digidust.elokence.akinator.paid.databinding.ActivityCongratsRareCharacterBinding r6 = r5.C
            if (r6 != 0) goto Lc8
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r0)
            goto Lc9
        Lc8:
            r1 = r6
        Lc9:
            android.widget.RelativeLayout r6 = r1.mainLayout
            on.w r0 = r5.E
            r1 = 2000(0x7d0, double:9.88E-321)
            r6.postDelayed(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.rarecharacter.CongratRareCharacterActivity.onCreate(android.os.Bundle):void");
    }
}
