package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class TtmlNode {
    public static final String ANONYMOUS_REGION_ID = "";
    public static final String ATTR_ID = "id";
    public static final String ATTR_TTS_BACKGROUND_COLOR = "backgroundColor";
    public static final String ATTR_TTS_COLOR = "color";
    public static final String ATTR_TTS_DISPLAY_ALIGN = "displayAlign";
    public static final String ATTR_TTS_EXTENT = "extent";
    public static final String ATTR_TTS_FONT_FAMILY = "fontFamily";
    public static final String ATTR_TTS_FONT_SIZE = "fontSize";
    public static final String ATTR_TTS_FONT_STYLE = "fontStyle";
    public static final String ATTR_TTS_FONT_WEIGHT = "fontWeight";
    public static final String ATTR_TTS_ORIGIN = "origin";
    public static final String ATTR_TTS_TEXT_ALIGN = "textAlign";
    public static final String ATTR_TTS_TEXT_DECORATION = "textDecoration";
    public static final String BOLD = "bold";
    public static final String CENTER = "center";
    public static final String END = "end";
    public static final String ITALIC = "italic";
    public static final String LEFT = "left";
    public static final String LINETHROUGH = "linethrough";
    public static final String NO_LINETHROUGH = "nolinethrough";
    public static final String NO_UNDERLINE = "nounderline";
    public static final String RIGHT = "right";
    public static final String START = "start";
    public static final String TAG_BODY = "body";
    public static final String TAG_BR = "br";
    public static final String TAG_DIV = "div";
    public static final String TAG_HEAD = "head";
    public static final String TAG_LAYOUT = "layout";
    public static final String TAG_METADATA = "metadata";
    public static final String TAG_P = "p";
    public static final String TAG_REGION = "region";
    public static final String TAG_SMPTE_DATA = "smpte:data";
    public static final String TAG_SMPTE_IMAGE = "smpte:image";
    public static final String TAG_SMPTE_INFORMATION = "smpte:information";
    public static final String TAG_SPAN = "span";
    public static final String TAG_STYLE = "style";
    public static final String TAG_STYLING = "styling";
    public static final String TAG_TT = "tt";
    public static final String UNDERLINE = "underline";
    private List<TtmlNode> children;
    public final long endTimeUs;
    public final boolean isTextNode;
    private final HashMap<String, Integer> nodeEndsByRegion;
    private final HashMap<String, Integer> nodeStartsByRegion;
    public final String regionId;
    public final long startTimeUs;
    public final TtmlStyle style;
    private final String[] styleIds;
    public final String tag;
    public final String text;

    private TtmlNode(String str, String str2, long j10, long j11, TtmlStyle ttmlStyle, String[] strArr, String str3) {
        this.tag = str;
        this.text = str2;
        this.style = ttmlStyle;
        this.styleIds = strArr;
        this.isTextNode = str2 != null;
        this.startTimeUs = j10;
        this.endTimeUs = j11;
        this.regionId = (String) Assertions.checkNotNull(str3);
        this.nodeStartsByRegion = new HashMap<>();
        this.nodeEndsByRegion = new HashMap<>();
    }

    private void applyStyleToOutput(Map<String, TtmlStyle> map, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        TtmlStyle ttmlStyleResolveStyle = TtmlRenderUtil.resolveStyle(this.style, this.styleIds, map);
        if (ttmlStyleResolveStyle != null) {
            TtmlRenderUtil.applyStylesToSpan(spannableStringBuilder, i10, i11, ttmlStyleResolveStyle);
        }
    }

    public static TtmlNode buildNode(String str, long j10, long j11, TtmlStyle ttmlStyle, String[] strArr, String str2) {
        return new TtmlNode(str, null, j10, j11, ttmlStyle, strArr, str2);
    }

    public static TtmlNode buildTextNode(String str) {
        return new TtmlNode(null, TtmlRenderUtil.applyTextElementSpacePolicy(str), C.TIME_UNSET, C.TIME_UNSET, null, null, "");
    }

    private SpannableStringBuilder cleanUpText(SpannableStringBuilder spannableStringBuilder) {
        int i10;
        int i11;
        int length = spannableStringBuilder.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (spannableStringBuilder.charAt(i13) == ' ') {
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i15) == ' ') {
                    i15++;
                }
                int i16 = i15 - i14;
                if (i16 > 0) {
                    spannableStringBuilder.delete(i13, i13 + i16);
                    length -= i16;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i17 = 0;
        while (true) {
            i10 = length - 1;
            if (i17 >= i10) {
                break;
            }
            if (spannableStringBuilder.charAt(i17) == '\n') {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i18) == ' ') {
                    spannableStringBuilder.delete(i18, i17 + 2);
                    length--;
                }
            }
            i17++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i10) == ' ') {
            spannableStringBuilder.delete(i10, length);
            length--;
        }
        while (true) {
            i11 = length - 1;
            if (i12 >= i11) {
                break;
            }
            if (spannableStringBuilder.charAt(i12) == ' ') {
                int i19 = i12 + 1;
                if (spannableStringBuilder.charAt(i19) == '\n') {
                    spannableStringBuilder.delete(i12, i19);
                    length--;
                }
            }
            i12++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i11) == '\n') {
            spannableStringBuilder.delete(i11, length);
        }
        return spannableStringBuilder;
    }

    private void getEventTimes(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.tag);
        if (z10 || zEquals) {
            long j10 = this.startTimeUs;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.endTimeUs;
            if (j11 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.children == null) {
            return;
        }
        for (int i10 = 0; i10 < this.children.size(); i10++) {
            this.children.get(i10).getEventTimes(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder getRegionOutput(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    private void traverseForStyle(long j10, Map<String, TtmlStyle> map, Map<String, SpannableStringBuilder> map2) {
        int iIntValue;
        if (isActive(j10)) {
            Iterator<Map.Entry<String, Integer>> it = this.nodeEndsByRegion.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                iIntValue = this.nodeStartsByRegion.containsKey(key) ? this.nodeStartsByRegion.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    applyStyleToOutput(map, map2.get(key), iIntValue, iIntValue2);
                }
            }
            while (iIntValue < getChildCount()) {
                getChild(iIntValue).traverseForStyle(j10, map, map2);
                iIntValue++;
            }
        }
    }

    private void traverseForText(long j10, boolean z10, String str, Map<String, SpannableStringBuilder> map) {
        boolean z11;
        Map<String, SpannableStringBuilder> map2;
        long j11;
        this.nodeStartsByRegion.clear();
        this.nodeEndsByRegion.clear();
        if (TAG_METADATA.equals(this.tag)) {
            return;
        }
        if (!"".equals(this.regionId)) {
            str = this.regionId;
        }
        String str2 = str;
        if (this.isTextNode && z10) {
            getRegionOutput(str2, map).append((CharSequence) this.text);
            return;
        }
        if (TAG_BR.equals(this.tag) && z10) {
            getRegionOutput(str2, map).append('\n');
            return;
        }
        if (isActive(j10)) {
            for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                this.nodeStartsByRegion.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
            }
            boolean zEquals = "p".equals(this.tag);
            int i10 = 0;
            while (i10 < getChildCount()) {
                TtmlNode child = getChild(i10);
                if (z10 || zEquals) {
                    z11 = true;
                    map2 = map;
                    j11 = j10;
                } else {
                    z11 = false;
                    j11 = j10;
                    map2 = map;
                }
                child.traverseForText(j11, z11, str2, map2);
                i10++;
                j10 = j11;
                map = map2;
            }
            Map<String, SpannableStringBuilder> map3 = map;
            if (zEquals) {
                TtmlRenderUtil.endParagraph(getRegionOutput(str2, map3));
            }
            for (Map.Entry<String, SpannableStringBuilder> entry2 : map3.entrySet()) {
                this.nodeEndsByRegion.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
            }
        }
    }

    public void addChild(TtmlNode ttmlNode) {
        if (this.children == null) {
            this.children = new ArrayList();
        }
        this.children.add(ttmlNode);
    }

    public TtmlNode getChild(int i10) {
        List<TtmlNode> list = this.children;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getChildCount() {
        List<TtmlNode> list = this.children;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<Cue> getCues(long j10, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2) {
        TreeMap treeMap = new TreeMap();
        traverseForText(j10, false, this.regionId, treeMap);
        traverseForStyle(j10, map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion = map2.get(entry.getKey());
            arrayList.add(new Cue(cleanUpText((SpannableStringBuilder) entry.getValue()), (Layout.Alignment) null, ttmlRegion.line, ttmlRegion.lineType, ttmlRegion.lineAnchor, ttmlRegion.position, Integer.MIN_VALUE, ttmlRegion.width, ttmlRegion.textSizeType, ttmlRegion.textSize));
        }
        return arrayList;
    }

    public long[] getEventTimesUs() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        getEventTimes(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public String[] getStyleIds() {
        return this.styleIds;
    }

    public boolean isActive(long j10) {
        long j11 = this.startTimeUs;
        if (j11 == C.TIME_UNSET && this.endTimeUs == C.TIME_UNSET) {
            return true;
        }
        if (j11 <= j10 && this.endTimeUs == C.TIME_UNSET) {
            return true;
        }
        if (j11 != C.TIME_UNSET || j10 >= this.endTimeUs) {
            return j11 <= j10 && j10 < this.endTimeUs;
        }
        return true;
    }
}
