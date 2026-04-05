package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class DyOption {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f40297a;

    /* renamed from: b, reason: collision with root package name */
    private File f40298b;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f40299c;

    /* renamed from: d, reason: collision with root package name */
    private DyAdType f40300d;

    /* renamed from: e, reason: collision with root package name */
    private String f40301e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f40302f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40303g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f40304h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f40305i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f40306j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f40307k;

    /* renamed from: l, reason: collision with root package name */
    private int f40308l;

    /* renamed from: m, reason: collision with root package name */
    private int f40309m;

    /* renamed from: n, reason: collision with root package name */
    private int f40310n;

    /* renamed from: o, reason: collision with root package name */
    private int f40311o;

    /* renamed from: p, reason: collision with root package name */
    private int f40312p;

    /* renamed from: q, reason: collision with root package name */
    private int f40313q;

    /* renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f40314r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder implements IViewOptionBuilder {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f40315a;

        /* renamed from: b, reason: collision with root package name */
        private File f40316b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f40317c;

        /* renamed from: d, reason: collision with root package name */
        private DyAdType f40318d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f40319e;

        /* renamed from: f, reason: collision with root package name */
        private String f40320f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f40321g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f40322h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f40323i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f40324j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f40325k;

        /* renamed from: l, reason: collision with root package name */
        private int f40326l;

        /* renamed from: m, reason: collision with root package name */
        private int f40327m;

        /* renamed from: n, reason: collision with root package name */
        private int f40328n;

        /* renamed from: o, reason: collision with root package name */
        private int f40329o;

        /* renamed from: p, reason: collision with root package name */
        private int f40330p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f40320f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f40317c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z10) {
            this.f40319e = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i10) {
            this.f40329o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f40318d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f40316b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f40315a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z10) {
            this.f40324j = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z10) {
            this.f40322h = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z10) {
            this.f40325k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z10) {
            this.f40321g = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z10) {
            this.f40323i = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i10) {
            this.f40328n = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i10) {
            this.f40326l = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i10) {
            this.f40327m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i10) {
            this.f40330p = i10;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z10);

        IViewOptionBuilder countDownTime(int i10);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z10);

        IViewOptionBuilder isClickButtonVisible(boolean z10);

        IViewOptionBuilder isLogoVisible(boolean z10);

        IViewOptionBuilder isScreenClick(boolean z10);

        IViewOptionBuilder isShakeVisible(boolean z10);

        IViewOptionBuilder orientation(int i10);

        IViewOptionBuilder shakeStrenght(int i10);

        IViewOptionBuilder shakeTime(int i10);

        IViewOptionBuilder templateType(int i10);
    }

    public DyOption(Builder builder) {
        this.f40297a = builder.f40315a;
        this.f40298b = builder.f40316b;
        this.f40299c = builder.f40317c;
        this.f40300d = builder.f40318d;
        this.f40303g = builder.f40319e;
        this.f40301e = builder.f40320f;
        this.f40302f = builder.f40321g;
        this.f40304h = builder.f40322h;
        this.f40306j = builder.f40324j;
        this.f40305i = builder.f40323i;
        this.f40307k = builder.f40325k;
        this.f40308l = builder.f40326l;
        this.f40309m = builder.f40327m;
        this.f40310n = builder.f40328n;
        this.f40311o = builder.f40329o;
        this.f40313q = builder.f40330p;
    }

    public String getAdChoiceLink() {
        return this.f40301e;
    }

    public CampaignEx getCampaignEx() {
        return this.f40299c;
    }

    public int getCountDownTime() {
        return this.f40311o;
    }

    public int getCurrentCountDown() {
        return this.f40312p;
    }

    public DyAdType getDyAdType() {
        return this.f40300d;
    }

    public File getFile() {
        return this.f40298b;
    }

    public List<String> getFileDirs() {
        return this.f40297a;
    }

    public int getOrientation() {
        return this.f40310n;
    }

    public int getShakeStrenght() {
        return this.f40308l;
    }

    public int getShakeTime() {
        return this.f40309m;
    }

    public int getTemplateType() {
        return this.f40313q;
    }

    public boolean isApkInfoVisible() {
        return this.f40306j;
    }

    public boolean isCanSkip() {
        return this.f40303g;
    }

    public boolean isClickButtonVisible() {
        return this.f40304h;
    }

    public boolean isClickScreen() {
        return this.f40302f;
    }

    public boolean isLogoVisible() {
        return this.f40307k;
    }

    public boolean isShakeVisible() {
        return this.f40305i;
    }

    public void setDyCountDownListener(int i10) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f40314r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i10);
        }
        this.f40312p = i10;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f40314r = dyCountDownListenerWrapper;
    }
}
