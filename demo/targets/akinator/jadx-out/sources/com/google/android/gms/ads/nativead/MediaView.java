package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbjc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private boolean zzb;
    private zzbhu zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private zzbhw zzf;

    public MediaView(Context context) {
        super(context);
    }

    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        zzbhw zzbhwVar = this.zzf;
        if (zzbhwVar != null) {
            zzbhwVar.zza(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        boolean zZzt;
        this.zzb = true;
        this.zza = mediaContent;
        zzbhu zzbhuVar = this.zzc;
        if (zzbhuVar != null) {
            zzbhuVar.zza(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzbjc zzbjcVarZzb = mediaContent.zzb();
            if (zzbjcVarZzb != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zza()) {
                        zZzt = zzbjcVarZzb.zzt(ObjectWrapper.wrap(this));
                    }
                    removeAllViews();
                }
                zZzt = zzbjcVarZzb.zzn(ObjectWrapper.wrap(this));
                if (zZzt) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e10) {
            removeAllViews();
            zzo.zzg("", e10);
        }
    }

    public final synchronized void zza(zzbhu zzbhuVar) {
        this.zzc = zzbhuVar;
        if (this.zzb) {
            zzbhuVar.zza(this.zza);
        }
    }

    public final synchronized void zzb(zzbhw zzbhwVar) {
        this.zzf = zzbhwVar;
        if (this.zze) {
            zzbhwVar.zza(this.zzd);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
