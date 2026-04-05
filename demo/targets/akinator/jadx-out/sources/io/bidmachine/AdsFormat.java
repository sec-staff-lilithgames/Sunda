package io.bidmachine;

import android.text.TextUtils;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Banner' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdsFormat {
    private static final /* synthetic */ AdsFormat[] $VALUES;
    public static final AdsFormat Banner;
    public static final AdsFormat Banner_300x250;
    public static final AdsFormat Banner_320x50;
    public static final AdsFormat Banner_728x90;
    public static final AdsFormat Interstitial;
    public static final AdsFormat InterstitialStatic;
    public static final AdsFormat InterstitialVideo;
    public static final AdsFormat Native;
    public static final AdsFormat Rewarded;
    public static final AdsFormat RewardedStatic;
    public static final AdsFormat RewardedVideo;
    private final x matcher;
    private final AdsFormat parent;
    private final String remoteName;

    private static /* synthetic */ AdsFormat[] $values() {
        return new AdsFormat[]{Banner, Banner_320x50, Banner_300x250, Banner_728x90, Interstitial, InterstitialVideo, InterstitialStatic, Rewarded, RewardedVideo, RewardedStatic, Native};
    }

    static {
        final AdsType adsType = AdsType.Banner;
        final int i10 = 2;
        AdsFormat adsFormat = new AdsFormat("Banner", 0, "banner", null, new x(adsType) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i10) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        Banner = adsFormat;
        final int i11 = 3;
        Banner_320x50 = new AdsFormat("Banner_320x50", 1, "banner_320x50", adsFormat, new x(adsType) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i11) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        final int i12 = 4;
        Banner_300x250 = new AdsFormat("Banner_300x250", 2, "banner_300x250", adsFormat, new x(adsType) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i12) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        final int i13 = 5;
        Banner_728x90 = new AdsFormat("Banner_728x90", 3, "banner_728x90", adsFormat, new x(adsType) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i13) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        final AdsType adsType2 = AdsType.Interstitial;
        final int i14 = 6;
        AdsFormat adsFormat2 = new AdsFormat("Interstitial", 4, "interstitial", null, new x(adsType2) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i14) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        Interstitial = adsFormat2;
        final int i15 = 7;
        InterstitialVideo = new AdsFormat("InterstitialVideo", 5, "interstitial_video", adsFormat2, new x(adsType2) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i15) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        final int i16 = 8;
        InterstitialStatic = new AdsFormat("InterstitialStatic", 6, "interstitial_static", adsFormat2, new x(adsType2) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i16) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        final AdsType adsType3 = AdsType.Rewarded;
        final int i17 = 9;
        AdsFormat adsFormat3 = new AdsFormat("Rewarded", 7, "rewarded", null, new x(adsType3) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i17) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        Rewarded = adsFormat3;
        final int i18 = 10;
        RewardedVideo = new AdsFormat("RewardedVideo", 8, "rewarded_video", adsFormat3, new x(adsType3) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i18) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        final int i19 = 0;
        RewardedStatic = new AdsFormat("RewardedStatic", 9, "rewarded_static", adsFormat3, new x(adsType3) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i19) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        final AdsType adsType4 = AdsType.Native;
        final int i20 = 1;
        Native = new AdsFormat("Native", 10, "native", null, new x(adsType4) { // from class: io.bidmachine.w
            @Override // io.bidmachine.x
            public final boolean a(hr.d dVar, AdContentType adContentType) {
                switch (i20) {
                    case 0:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_320x50) {
                        }
                        break;
                    case 4:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_300x250) {
                        }
                        break;
                    case 5:
                        if (((mm.d) ((hr.g) dVar)).getAdRequestParameters().getBannerSize() == mm.g.Size_728x90) {
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                    case 8:
                        if (adContentType == AdContentType.Static) {
                        }
                        break;
                    case 9:
                        break;
                    default:
                        if (adContentType == AdContentType.Video) {
                        }
                        break;
                }
                return true;
            }
        });
        $VALUES = $values();
    }

    private AdsFormat(String str, int i10, String str2, AdsFormat adsFormat, x xVar) {
        this.remoteName = str2;
        this.parent = adsFormat;
        this.matcher = xVar;
    }

    public static AdsFormat byRemoteName(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (AdsFormat adsFormat : values()) {
            if (adsFormat.remoteName.equals(str)) {
                return adsFormat;
            }
        }
        return null;
    }

    public static AdsFormat valueOf(String str) {
        return (AdsFormat) Enum.valueOf(AdsFormat.class, str);
    }

    public static AdsFormat[] values() {
        return (AdsFormat[]) $VALUES.clone();
    }

    public AdsType getAdsType() {
        return this.matcher.f62042a;
    }

    public AdsFormat getParent() {
        return this.parent;
    }

    public String getRemoteName() {
        return this.remoteName;
    }

    public <T extends hr.d> boolean isMatch(AdsType adsType, T t10, AdContentType adContentType) {
        x xVar = this.matcher;
        return adsType == xVar.f62042a && xVar.a(t10, adContentType);
    }
}
