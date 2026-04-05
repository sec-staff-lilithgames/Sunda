package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbeu;
import com.unity3d.ads.BuildConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzah zzb;

    public zzu(Context context, zzt zztVar, zzah zzahVar) throws Resources.NotFoundException {
        super(context);
        this.zzb = zzahVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbb.zza();
        int iZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zza);
        zzbb.zza();
        int iZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, 0);
        zzbb.zza();
        int iZzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzb);
        zzbb.zza();
        imageButton.setPadding(iZzC, iZzC2, iZzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzbb.zza();
        int iZzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        zzbb.zza();
        addView(imageButton, new FrameLayout.LayoutParams(iZzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzd + zztVar.zzc), 17));
        long jLongValue = ((Long) zzbd.zzc().zzd(zzbeu.zzbu)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        zzs zzsVar = ((Boolean) zzbd.zzc().zzd(zzbeu.zzbv)).booleanValue() ? new zzs(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(zzsVar);
    }

    private final void zzc() throws Resources.NotFoundException {
        String str = (String) zzbd.zzc().zzd(zzbeu.zzbt);
        if (TextUtils.isEmpty(str) || BuildConfig.FLAVOR.equals(str)) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesZzf.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = resourcesZzf.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        ImageButton imageButton = this.zza;
        imageButton.setImageDrawable(drawable);
        imageButton.setScaleType(ImageView.ScaleType.CENTER);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzah zzahVar = this.zzb;
        if (zzahVar != null) {
            zzahVar.zzd();
        }
    }

    public final void zza(boolean z10) {
        if (!z10) {
            this.zza.setVisibility(0);
            return;
        }
        ImageButton imageButton = this.zza;
        imageButton.setVisibility(8);
        if (((Long) zzbd.zzc().zzd(zzbeu.zzbu)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }

    public final /* synthetic */ ImageButton zzb() {
        return this.zza;
    }
}
