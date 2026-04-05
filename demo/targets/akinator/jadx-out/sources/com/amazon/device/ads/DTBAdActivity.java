package com.amazon.device.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBAdActivity extends Activity {
    public static final String ADTYPE_ATTR = "ad_state";
    public static final String EXPANDED = "expanded";
    public static final String INDEX_ATTR = "cntrl_index";
    public static final String TWO_PART_EXPAND = "two_part_expand";
    public static final String URL_ATTR = "url";
    public final String LOG_TAG = "DTBAdActivity";
    public DTBAdView adView;
    public int index;
    public RelativeLayout pageLayout;
    public String type;

    private void createExpanded() {
        this.adView = new DTBAdView(this, new DTBAdExpandedListener() { // from class: com.amazon.device.ads.DTBAdActivity.1
            @Override // com.amazon.device.ads.DTBAdExpandedListener
            public void onAdLoaded(DTBAdView dTBAdView) {
            }

            @Override // com.amazon.device.ads.DTBAdExpandedListener
            public void onCreateExpandedController(DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController) {
            }
        }, this.index);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra(TWO_PART_EXPAND, false);
        this.pageLayout.addView(this.adView, -1, -1);
        this.adView.fetchAdWithLocation(stringExtra);
        this.adView.setScrollEnabled(true);
        DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController = (DTBAdMRAIDExpandedController) this.adView.getController();
        dTBAdMRAIDExpandedController.setTwoPartExpand(booleanExtra);
        dTBAdMRAIDExpandedController.addCloseIndicator();
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            this.adView.getController().closeExpandedPartTwo();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute finish method", e10);
        }
    }

    public void handleOrientation() {
        Serializable serializableExtra = getIntent().getSerializableExtra("orientation");
        if (serializableExtra != null) {
            Map map = (Map) serializableExtra;
            boolean zBooleanValue = ((Boolean) map.get("allowOrientationChange")).booleanValue();
            String str = (String) map.get("forceOrientation");
            if (str != null) {
                if ("portrait".equals(str)) {
                    setRequestedOrientation(1);
                    return;
                }
                if ("landscape".equals(str)) {
                    setRequestedOrientation(0);
                } else {
                    if (zBooleanValue) {
                        return;
                    }
                    if (DisplayUtils.determineSimpleOrientation() == 2) {
                        setRequestedOrientation(6);
                    } else {
                        setRequestedOrientation(7);
                    }
                }
            }
        }
    }

    public boolean isExpanded() {
        return EXPANDED.equals(this.type);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.pageLayout = relativeLayout;
        setContentView(relativeLayout);
        this.type = getIntent().getStringExtra(ADTYPE_ATTR);
        this.index = getIntent().getIntExtra(INDEX_ATTR, 0);
        if (this.type.equals(EXPANDED)) {
            createExpanded();
        }
        handleOrientation();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public void straightFinish() {
        super.finish();
    }
}
