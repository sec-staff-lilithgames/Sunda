package com.fyber.inneractive.sdk.player.controller;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f24416a;

    /* renamed from: b, reason: collision with root package name */
    public final Dialog f24417b;

    public f0(Context context, com.fyber.inneractive.sdk.config.global.features.c cVar, v vVar) {
        this.f24416a = vVar;
        Dialog dialog = new Dialog(context);
        this.f24417b = dialog;
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.ia_layout_skip_rewarded_dialog);
        Button button = (Button) dialog.findViewById(R.id.ia_keep_watching_button);
        Button button2 = (Button) dialog.findViewById(R.id.ia_close_button);
        TextView textView = (TextView) dialog.findViewById(R.id.ia_skip_dialog_title_textview);
        TextView textView2 = (TextView) dialog.findViewById(R.id.ia_skip_dialog_sub_title_textview);
        String string = context.getString(R.string.ia_skip_rewarded_dialog_keep_watching);
        String string2 = context.getString(R.string.ia_skip_rewarded_dialog_close_button);
        String string3 = context.getString(R.string.ia_skip_rewarded_dialog_title);
        String string4 = context.getString(R.string.ia_skip_rewarded_dialog_sub_title);
        if (cVar != null) {
            String strA = cVar.a("skip_reward_dialog_keep_watching_button", "KEEP WATCHING");
            String strTrim = strA.trim().length() > 0 ? strA.trim() : "KEEP WATCHING";
            string = TextUtils.isEmpty(strTrim) ? string : strTrim;
            String strA2 = cVar.a("skip_reward_dialog_close_button", "CLOSE");
            String strTrim2 = strA2.trim().length() > 0 ? strA2.trim() : "CLOSE";
            string2 = TextUtils.isEmpty(strTrim2) ? string2 : strTrim2;
            String strA3 = cVar.a("skip_reward_dialog_title", "Close Video?");
            String strTrim3 = strA3.trim().length() > 0 ? strA3.trim() : "Close Video?";
            string3 = TextUtils.isEmpty(strTrim3) ? string3 : strTrim3;
            String strA4 = cVar.a("skip_reward_dialog_sub_title", "Reward will not be received before video completion.");
            String strTrim4 = strA4.trim().length() > 0 ? strA4.trim() : "Reward will not be received before video completion.";
            if (!TextUtils.isEmpty(strTrim4)) {
                string4 = strTrim4;
            }
        }
        button.setText(i1.a(string, 13));
        button2.setText(i1.a(string2, 13));
        textView.setText(i1.a(string3, 20));
        textView2.setText(i1.a(string4, 100));
        button2.setOnClickListener(new d0(this));
        button.setOnClickListener(new e0(this));
    }
}
