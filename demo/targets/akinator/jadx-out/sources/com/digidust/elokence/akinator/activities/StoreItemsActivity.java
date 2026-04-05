package com.digidust.elokence.akinator.activities;

import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import bj.v0;
import ca.b;
import ca.m;
import ca.r;
import ca.t;
import com.amazon.device.ads.DtbConstants;
import com.digidust.elokence.akinator.activities.StoreItemsActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.concurrent.Callable;
import lb.b1;
import mt.b0;
import na.a;
import o9.k0;
import o9.v9;
import o9.w9;
import o9.x9;
import o9.y9;
import ot.c;
import ou.j;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class StoreItemsActivity extends AkActivity {
    public static final String[] U = {"turban", "rap", "scuba", "chevalier", "elvis", "cowboy", "mexicain", "disco", "indien", "punk", "pirate"};
    public static final int[] V = {0, 1000, 1750, 3750, 5000, 6250, 7500, 10000, 11250, 12500, 13750};
    public static final String[] W = {"orient", "yukata", "rap", "chevalier", "scuba", "mexicain", "cowboy", "disco", "catcheur", "indien", "dracula", "superheros", "pirate"};
    public static final int[] X = {0, 0, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 3750, 6250, 7500, 10000, 12500, DtbConstants.NETWORK_READ_TIMEOUT, 15000, 20000, 23750, 27500};
    public Button C;
    public Button D;
    public Button E;
    public Button F;
    public ImageView G;
    public ImageView H;
    public TextView I;
    public TextView J;
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public int N = 0;
    public y9 O = null;
    public y9 P = null;
    public final w9 Q = new w9(this);
    public final v9 R = new v9(this, 2);
    public final x9 S = new x9(this);
    public final v9 T = new v9(this, 3);

    public static void v(final int i10, final boolean z10, final boolean z11) {
        b0.fromCallable(new Callable() { // from class: o9.u9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = StoreItemsActivity.U;
                return Integer.valueOf(ca.o.sharedInstance().updateUserAccesories(z10, z11, ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getKeyUser(), i10, String.valueOf(ca.m.sharedInstance().getCurrentSubject())));
            }
        }).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new b(14));
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_store_items);
        if (!m.sharedInstance().getDisponibiliteAccessoires()) {
            finish();
            return;
        }
        ma.c cVar = ma.c.f74125c;
        this.f21697t = cVar;
        TextView textView = (TextView) findViewById(R.id.storeTexteAccepteCGV);
        Typeface typeface = this.f21686i;
        if (textView != null) {
            textView.setOnClickListener(new v9(this, 0));
            textView.setTypeface(typeface);
            textView.setText(b1.sharedInstance().getTraductionFromToken("CGV"));
            markTextviewForUpdate(textView);
        }
        Button button = (Button) findViewById(R.id.buttonHatLeft);
        this.C = button;
        w9 w9Var = this.Q;
        button.setOnClickListener(w9Var);
        Button button2 = (Button) findViewById(R.id.buttonHatRight);
        this.D = button2;
        button2.setOnClickListener(w9Var);
        this.G = (ImageView) findViewById(R.id.imageArrowBottom);
        this.I = (TextView) findViewById(R.id.textArrowBottom);
        this.G.setOnClickListener(this.R);
        Button button3 = (Button) findViewById(R.id.buttonClothLeft);
        this.E = button3;
        x9 x9Var = this.S;
        button3.setOnClickListener(x9Var);
        Button button4 = (Button) findViewById(R.id.buttonClothRight);
        this.F = button4;
        button4.setOnClickListener(x9Var);
        this.H = (ImageView) findViewById(R.id.imageArrowCloth);
        this.J = (TextView) findViewById(R.id.textArrowCloth);
        this.H.setOnClickListener(this.T);
        ((ImageView) findViewById(R.id.retourButton)).setOnClickListener(new v9(this, 1));
        this.I.setTypeface(typeface);
        this.J.setTypeface(typeface);
        int currentHatIndex = r.sharedInstance().getCurrentHatIndex();
        this.L = currentHatIndex;
        this.K = currentHatIndex;
        int currentClothIndex = r.sharedInstance().getCurrentClothIndex();
        this.N = currentClothIndex;
        this.M = currentClothIndex;
        q(R.id.akinatorImage, t.sharedInstance().getAkiBitmap("akinator_defi"));
        m.sharedInstance().setShortMusic(0);
        a.sharedInstance();
        a.startMusic(cVar);
        t("hat");
        t("cloth");
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        y9 y9Var = this.O;
        if (y9Var != null) {
            y9Var.cancel(true);
            this.O = null;
        }
        y9 y9Var2 = this.P;
        if (y9Var2 != null) {
            y9Var2.cancel(true);
            this.P = null;
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        r rVarSharedInstance = r.sharedInstance();
        int i10 = this.L;
        String[] strArr = U;
        if (rVarSharedInstance.isItemBought("hat", strArr[i10])) {
            m.sharedInstance().setHat(strArr[this.L]);
            r.sharedInstance().setCurrentHatIndex(this.L);
            if (m.sharedInstance().isUserConnected()) {
                v(this.L, true, true);
            }
        }
        r rVarSharedInstance2 = r.sharedInstance();
        int i11 = this.N;
        String[] strArr2 = W;
        if (rVarSharedInstance2.isItemBought("cloth", strArr2[i11])) {
            m.sharedInstance().setCloth(strArr2[this.N]);
            r.sharedInstance().setCurrentClothIndex(this.N);
            if (m.sharedInstance().isUserConnected()) {
                v(this.N, false, true);
            }
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void t(String str) {
        ImageView imageView;
        int i10;
        TextView textView;
        String[] strArr;
        int[] iArr;
        if (str.equals("hat")) {
            i10 = this.L;
            imageView = this.G;
            textView = this.I;
            strArr = U;
            iArr = V;
        } else if (str.equals("cloth")) {
            i10 = this.N;
            imageView = this.H;
            textView = this.J;
            strArr = W;
            iArr = X;
        } else {
            imageView = null;
            i10 = -1;
            textView = null;
            strArr = null;
            iArr = null;
        }
        if (!r.sharedInstance().isItemBought(str, strArr[i10])) {
            if (str.equals("hat")) {
                u(R.id.akinatorChapeau, "akinator_defi_chapeau_" + strArr[i10] + "_preview");
            } else if (str.equals("cloth")) {
                u(R.id.akinatorTenue, "akinator_defi_tenu_" + strArr[i10] + "_preview");
            }
            imageView.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(NumberFormat.getInstance().format(iArr[i10]));
            return;
        }
        imageView.setVisibility(4);
        textView.setVisibility(4);
        if (str.equals("hat") ? t.sharedInstance().isHatLoaded(strArr[i10]) : str.equals("cloth") ? t.sharedInstance().isTenueLoaded(strArr[i10]) : true) {
            if (str.equals("hat")) {
                q(R.id.akinatorChapeau, t.sharedInstance().getHatBitmap(strArr[i10], "akinator_defi"));
                return;
            } else {
                if (str.equals("cloth")) {
                    q(R.id.akinatorTenue, t.sharedInstance().getClothBitmap(strArr[i10], "akinator_defi"));
                    return;
                }
                return;
            }
        }
        if (str.equals("hat")) {
            y9 y9Var = new y9(this, str);
            this.O = y9Var;
            y9Var.execute(new Void[0]);
        } else if (str.equals("cloth")) {
            y9 y9Var2 = new y9(this, str);
            this.P = y9Var2;
            y9Var2.execute(new Void[0]);
        }
    }

    public final void u(int i10, String str) {
        if (((ImageView) findViewById(i10)) == null) {
            return;
        }
        try {
            q(i10, BitmapFactory.decodeStream(new BufferedInputStream(getResources().getAssets().open("drawable/" + str + ".png"), 32768)));
        } catch (IOException unused) {
            Timber.tag("Akinator").e("Impossible de charger l'image %s", str);
        } catch (OutOfMemoryError unused2) {
            Toast.makeText(this, b1.sharedInstance().getTraductionFromToken("MANQUE_DE_MEMOIRE"), 1).show();
        }
    }

    public final void w(int i10) {
        b0.fromCallable(new k0(i10, 3)).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new v0(this, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "backgroundChange"
            r2 = 0
            r0.putExtra(r1, r2)
            int r1 = r5.M
            int r3 = r5.N
            if (r1 == r3) goto L24
            ca.r r1 = ca.r.sharedInstance()
            java.lang.String[] r3 = com.digidust.elokence.akinator.activities.StoreItemsActivity.W
            int r4 = r5.N
            r3 = r3[r4]
            r4 = 0
            java.lang.String r4 = cv.BLca.YsiBvdpw.fsVwTWqALmuzrv
            boolean r1 = r1.isItemBought(r4, r3)
            if (r1 != 0) goto L3c
        L24:
            int r1 = r5.K
            int r3 = r5.L
            if (r1 == r3) goto L3e
            ca.r r1 = ca.r.sharedInstance()
            java.lang.String[] r3 = com.digidust.elokence.akinator.activities.StoreItemsActivity.U
            int r4 = r5.L
            r3 = r3[r4]
            java.lang.String r4 = "hat"
            boolean r1 = r1.isItemBought(r4, r3)
            if (r1 == 0) goto L3e
        L3c:
            r1 = 1
            goto L3f
        L3e:
            r1 = r2
        L3f:
            java.lang.String r3 = "akiChange"
            r0.putExtra(r3, r1)
            r5.setResult(r2, r0)
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.StoreItemsActivity.onBackPressed():void");
    }
}
