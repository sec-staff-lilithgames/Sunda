package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.NetworkInvitationActivity;
import com.digidust.elokence.akinator.freemium.R;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class NetworkInvitationActivity extends AkActivity {
    public static final /* synthetic */ int C = 0;

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_network_invitation);
        final int i10 = 0;
        ((ImageView) findViewById(R.id.crossNetworkInvitation)).setOnClickListener(new View.OnClickListener(this) { // from class: o9.t3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NetworkInvitationActivity f78562c;

            {
                this.f78562c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                NetworkInvitationActivity networkInvitationActivity = this.f78562c;
                switch (i11) {
                    case 0:
                        int i12 = NetworkInvitationActivity.C;
                        networkInvitationActivity.onBackPressed();
                        break;
                    case 1:
                        int i13 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getInstagramUrl())));
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        } catch (Exception unused2) {
                            networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getInstagramMobileUrl())));
                            return;
                        }
                    case 2:
                        int i14 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getFacebookUrl())));
                                break;
                            } catch (Exception unused3) {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getFacebookMobileUrl())));
                                return;
                            }
                        } catch (Exception unused4) {
                            return;
                        }
                    case 3:
                        int i15 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getTwitterUrl())));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        } catch (Exception unused6) {
                            networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getTwitterMobileUrl())));
                            return;
                        }
                    default:
                        int i16 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        ca.o.sharedInstance().setStatusNetworkInvitation(false);
                        networkInvitationActivity.onBackPressed();
                        break;
                }
            }
        });
        final int i11 = 1;
        ((ImageView) findViewById(R.id.instaImage)).setOnClickListener(new View.OnClickListener(this) { // from class: o9.t3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NetworkInvitationActivity f78562c;

            {
                this.f78562c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                NetworkInvitationActivity networkInvitationActivity = this.f78562c;
                switch (i112) {
                    case 0:
                        int i12 = NetworkInvitationActivity.C;
                        networkInvitationActivity.onBackPressed();
                        break;
                    case 1:
                        int i13 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getInstagramUrl())));
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        } catch (Exception unused2) {
                            networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getInstagramMobileUrl())));
                            return;
                        }
                    case 2:
                        int i14 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getFacebookUrl())));
                                break;
                            } catch (Exception unused3) {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getFacebookMobileUrl())));
                                return;
                            }
                        } catch (Exception unused4) {
                            return;
                        }
                    case 3:
                        int i15 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getTwitterUrl())));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        } catch (Exception unused6) {
                            networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getTwitterMobileUrl())));
                            return;
                        }
                    default:
                        int i16 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        ca.o.sharedInstance().setStatusNetworkInvitation(false);
                        networkInvitationActivity.onBackPressed();
                        break;
                }
            }
        });
        final int i12 = 2;
        ((ImageView) findViewById(R.id.fbImage)).setOnClickListener(new View.OnClickListener(this) { // from class: o9.t3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NetworkInvitationActivity f78562c;

            {
                this.f78562c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                NetworkInvitationActivity networkInvitationActivity = this.f78562c;
                switch (i112) {
                    case 0:
                        int i122 = NetworkInvitationActivity.C;
                        networkInvitationActivity.onBackPressed();
                        break;
                    case 1:
                        int i13 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getInstagramUrl())));
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        } catch (Exception unused2) {
                            networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getInstagramMobileUrl())));
                            return;
                        }
                    case 2:
                        int i14 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getFacebookUrl())));
                                break;
                            } catch (Exception unused3) {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getFacebookMobileUrl())));
                                return;
                            }
                        } catch (Exception unused4) {
                            return;
                        }
                    case 3:
                        int i15 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getTwitterUrl())));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        } catch (Exception unused6) {
                            networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getTwitterMobileUrl())));
                            return;
                        }
                    default:
                        int i16 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        ca.o.sharedInstance().setStatusNetworkInvitation(false);
                        networkInvitationActivity.onBackPressed();
                        break;
                }
            }
        });
        final int i13 = 3;
        ((ImageView) findViewById(R.id.twitterImage)).setOnClickListener(new View.OnClickListener(this) { // from class: o9.t3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NetworkInvitationActivity f78562c;

            {
                this.f78562c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                NetworkInvitationActivity networkInvitationActivity = this.f78562c;
                switch (i112) {
                    case 0:
                        int i122 = NetworkInvitationActivity.C;
                        networkInvitationActivity.onBackPressed();
                        break;
                    case 1:
                        int i132 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getInstagramUrl())));
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        } catch (Exception unused2) {
                            networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getInstagramMobileUrl())));
                            return;
                        }
                    case 2:
                        int i14 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getFacebookUrl())));
                                break;
                            } catch (Exception unused3) {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getFacebookMobileUrl())));
                                return;
                            }
                        } catch (Exception unused4) {
                            return;
                        }
                    case 3:
                        int i15 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getTwitterUrl())));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        } catch (Exception unused6) {
                            networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getTwitterMobileUrl())));
                            return;
                        }
                    default:
                        int i16 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        ca.o.sharedInstance().setStatusNetworkInvitation(false);
                        networkInvitationActivity.onBackPressed();
                        break;
                }
            }
        });
        Button button = (Button) findViewById(R.id.buttonNoNetworkInvitation);
        Typeface typeface = this.f21686i;
        button.setTypeface(typeface);
        button.setText(b1.sharedInstance().getTraductionFromToken("NOTE_NE_PLUS_DEMANDER"));
        final int i14 = 4;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: o9.t3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NetworkInvitationActivity f78562c;

            {
                this.f78562c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i14;
                NetworkInvitationActivity networkInvitationActivity = this.f78562c;
                switch (i112) {
                    case 0:
                        int i122 = NetworkInvitationActivity.C;
                        networkInvitationActivity.onBackPressed();
                        break;
                    case 1:
                        int i132 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getInstagramUrl())));
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        } catch (Exception unused2) {
                            networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getInstagramMobileUrl())));
                            return;
                        }
                    case 2:
                        int i142 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getFacebookUrl())));
                                break;
                            } catch (Exception unused3) {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getFacebookMobileUrl())));
                                return;
                            }
                        } catch (Exception unused4) {
                            return;
                        }
                    case 3:
                        int i15 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        try {
                            try {
                                networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getTwitterUrl())));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        } catch (Exception unused6) {
                            networkInvitationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ca.m.sharedInstance().getCurrentInstance().getTwitterMobileUrl())));
                            return;
                        }
                    default:
                        int i16 = NetworkInvitationActivity.C;
                        networkInvitationActivity.getClass();
                        ca.o.sharedInstance().setStatusNetworkInvitation(false);
                        networkInvitationActivity.onBackPressed();
                        break;
                }
            }
        });
        TextView textView = (TextView) findViewById(R.id.titleNetworkInvitation);
        textView.setTypeface(this.f21690m);
        textView.setText(b1.sharedInstance().getTraductionFromToken("INVITATION_RESEAUX_SOCIAUX_TTR"));
        TextView textView2 = (TextView) findViewById(R.id.descriptionNetworkInvitation);
        textView2.setTypeface(typeface);
        textView2.setText(b1.sharedInstance().getTraductionFromToken("INVITATION_RESEAUX_SOCIAUX_TXT"));
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
