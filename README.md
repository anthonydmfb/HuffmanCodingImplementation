# HuffmanCodingImplementation
Java implementation of Huffman coding for file compression and decompression. It computes character frequencies, builds a linked list and binary tree, and generates Huffman codes. Features include encoding/decoding text files and tree traversals in pre-order, in-order, and post-order.

Results:

outFile1 below	
Index chStr count
10    char10 397
13    char13 397
32    char32 3899
39    char39 15
40    char40 1
41    char41 1
44    char44 373
45    char45 1
46    char46 181
49    char49 23
51    char51 11
52    char52 1
53    char53 2
54    char54 11
56    char56 13
57    char57 11
59    char59 1
65    char65 47
66    char66 23
67    char67 34
68    char68 1
70    char70 12
71    char71 46
72    char72 3
73    char73 44
74    char74 1
76    char76 22
77    char77 6
78    char78 33
79    char79 6
80    char80 23
83    char83 40
84    char84 49
85    char85 25
87    char87 34
97    char97 1627
98    char98 271
99    char99 456
100    char100 876
101    char101 2547
102    char102 478
103    char103 406
104    char104 1240
105    char105 1131
106    char106 1
107    char107 81
108    char108 662
109    char109 269
110    char110 1321
111    char111 1436
112    char112 216
113    char113 11
114    char114 1226
115    char115 862
116    char116 1914
117    char117 343
118    char118 323
119    char119 338
120    char120 6
121    char121 260

Below is the ordered Huffman ordered Linked list
(Dummy, 0,  , Null, Null, j) -> (j, 1, null, Null, Null, J) -> (J, 1, null, Null, Null, D) -> (D, 1, null, Null, Null, ;) -> (;, 1, null, Null, Null, 4) -> (4, 1, null, Null, Null, -) -> (-, 1, null, Null, Null, )) -> (), 1, null, Null, Null, () -> ((, 1, null, Null, Null, 5) -> (5, 2, null, Null, Null, H) -> (H, 3, null, Null, Null, x) -> (x, 6, null, Null, Null, O) -> (O, 6, null, Null, Null, M) -> (M, 6, null, Null, Null, q) -> (q, 11, null, Null, Null, 9) -> (9, 11, null, Null, Null, 6) -> (6, 11, null, Null, Null, 3) -> (3, 11, null, Null, Null, F) -> (F, 12, null, Null, Null, 8) -> (8, 13, null, Null, Null, ') -> (', 15, null, Null, Null, L) -> (L, 22, null, Null, Null, P) -> (P, 23, null, Null, Null, B) -> (B, 23, null, Null, Null, 1) -> (1, 23, null, Null, Null, U) -> (U, 25, null, Null, Null, N) -> (N, 33, null, Null, Null, W) -> (W, 34, null, Null, Null, C) -> (C, 34, null, Null, Null, S) -> (S, 40, null, Null, Null, I) -> (I, 44, null, Null, Null, G) -> (G, 46, null, Null, Null, A) -> (A, 47, null, Null, Null, T) -> (T, 49, null, Null, Null, k) -> (k, 81, null, Null, Null, .) -> (., 181, null, Null, Null, p) -> (p, 216, null, Null, Null, y) -> (y, 260, null, Null, Null, m) -> (m, 269, null, Null, Null, b) -> (b, 271, null, Null, Null, v) -> (v, 323, null, Null, Null, w) -> (w, 338, null, Null, Null, u) -> (u, 343, null, Null, Null, ,) -> (,, 373, null, Null, Null, 13) -> (13, 397, null, Null, Null, 10) -> (10, 397, null, Null, Null, g) -> (g, 406, null, Null, Null, c) -> (c, 456, null, Null, Null, f) -> (f, 478, null, Null, Null, l) -> (l, 662, null, Null, Null, s) -> (s, 862, null, Null, Null, d) -> (d, 876, null, Null, Null, i) -> (i, 1131, null, Null, Null, r) -> (r, 1226, null, Null, Null, h) -> (h, 1240, null, Null, Null, n) -> (n, 1321, null, Null, Null, o) -> (o, 1436, null, Null, Null, a) -> (a, 1627, null, Null, Null, t) -> (t, 1914, null, Null, Null, e) -> (e, 2547, null, Null, Null, 32) -> (32, 3899, null, Null, Null, Null) -> null

Below is preOrder of the Huffman Binary Tree
(10, 24088, , ibU8'NWCSkvwrhenluD;jJ)(4-5Hx63q9LIPB., 10, Null) -> (ibU8'NWCSkvwrhenluD;jJ)(4-5Hx63q9LIPB., 10033, , ibU8'NWCSkvwrh, enluD;jJ)(4-5Hx63q9LIPB., 10) -> (ibU8'NWCSkvwrh, 4804, , ibU8'NWCSkvw, rh, enluD;jJ)(4-5Hx63q9LIPB.) -> (ibU8'NWCSkvw, 2338, , i, bU8'NWCSkvw, rh) -> (i, 1131, null, Null, Null, bU8'NWCSkvw) -> (bU8'NWCSkvw, 1207, , bU8'NWCSk, vw, r) -> (bU8'NWCSk, 546, , b, U8'NWCSk, vw) -> (b, 271, null, Null, Null, U8'NWCSk) -> (U8'NWCSk, 275, , U8'NW, CSk, v) -> (U8'NW, 120, , U8', NW, CSk) -> (U8', 53, , U, 8', NW) -> (U, 25, null, Null, Null, 8') -> (8', 28, , 8, ', N) -> (8, 13, null, Null, Null, ') -> (', 15, null, Null, Null, D;jJ)(4-5Hx) -> (NW, 67, , N, W, CS) -> (N, 33, null, Null, Null, W) -> (W, 34, null, Null, Null, C) -> (CSk, 155, , CS, k, D;jJ)(4-5Hx63q9LIPB) -> (CS, 74, , C, S, k) -> (C, 34, null, Null, Null, S) -> (S, 40, null, Null, Null, D;jJ)(4-5Hx63) -> (k, 81, null, Null, Null, D;jJ)(4-5Hx63q9L) -> (vw, 661, , v, w, l) -> (v, 323, null, Null, Null, w) -> (w, 338, null, Null, Null, u) -> (rh, 2466, , r, h, e) -> (r, 1226, null, Null, Null, h) -> (h, 1240, null, Null, Null, n) -> (enluD;jJ)(4-5Hx63q9LIPB., 5229, , e, nluD;jJ)(4-5Hx63q9LIPB., 10) -> (e, 2547, null, Null, Null, nluD;jJ)(4-5Hx63q9LIPB.) -> (nluD;jJ)(4-5Hx63q9LIPB., 2682, , n, luD;jJ)(4-5Hx63q9LIPB., 10) -> (n, 1321, null, Null, Null, luD;jJ)(4-5Hx63q9LIPB.) -> (luD;jJ)(4-5Hx63q9LIPB., 1361, , l, uD;jJ)(4-5Hx63q9LIPB., o) -> (l, 662, null, Null, Null, uD;jJ)(4-5Hx63q9LIPB.) -> (uD;jJ)(4-5Hx63q9LIPB., 699, , u, D;jJ)(4-5Hx63q9LIPB., 13) -> (u, 343, null, Null, Null, D;jJ)(4-5Hx63q9LIPB.) -> (D;jJ)(4-5Hx63q9LIPB., 356, , D;jJ)(4-5Hx63q9LIPB, ., ,) -> (D;jJ)(4-5Hx63q9LIPB, 175, , D;jJ)(4-5Hx63q9L, IPB, .) -> (D;jJ)(4-5Hx63q9L, 85, , D;jJ)(4-5Hx63, q9L, IPB) -> (D;jJ)(4-5Hx63, 41, , D;jJ)(4-5Hx, 63, q9L) -> (D;jJ)(4-5Hx, 19, , D;jJ)(4-, 5Hx, 63) -> (D;jJ)(4-, 8, , D;jJ, )(4-, 5Hx) -> (D;jJ, 4, , D;, jJ, )(4-) -> (D;, 2, , D, ;, jJ) -> (D, 1, null, Null, Null, ;) -> (;, 1, null, Null, Null, 4) -> (jJ, 2, , j, J, 5) -> (j, 1, null, Null, Null, J) -> (J, 1, null, Null, Null, D) -> ()(4-, 4, , )(, 4-, 5H) -> ()(, 2, , ), (, 4-) -> (), 1, null, Null, Null, () -> ((, 1, null, Null, Null, )() -> (4-, 2, , 4, -, D;) -> (4, 1, null, Null, Null, -) -> (-, 1, null, Null, Null, )) -> (5Hx, 11, , 5H, x, q) -> (5H, 5, , 5, H, x) -> (5, 2, null, Null, Null, H) -> (H, 3, null, Null, Null, D;jJ) -> (x, 6, null, Null, Null, O) -> (63, 22, , 6, 3, q9) -> (6, 11, null, Null, Null, 3) -> (3, 11, null, Null, Null, OM) -> (q9L, 44, , q9, L, I) -> (q9, 22, , q, 9, L) -> (q, 11, null, Null, Null, 9) -> (9, 11, null, Null, Null, 6) -> (L, 22, null, Null, Null, P) -> (IPB, 90, , I, PB, G1OMF) -> (I, 44, null, Null, Null, PB) -> (PB, 46, , P, B, G) -> (P, 23, null, Null, Null, B) -> (B, 23, null, Null, Null, 1) -> (., 181, null, Null, Null, G1OMFAT) -> (10, 14055, , 10, 32, 10) -> (10, 6359, , 10, agcs, 32) -> (10, 3008, , o, 10, agcs) -> (o, 1436, null, Null, Null, 10) -> (10, 1572, , 13, 10, a) -> (13, 770, , ,, 13, 10) -> (,, 373, null, Null, Null, 13) -> (13, 397, null, Null, Null, 10) -> (10, 802, , 10, G1OMFATp, gc) -> (10, 397, null, Null, Null, G1OMFATp) -> (G1OMFATp, 405, , G1OMFAT, p, g) -> (G1OMFAT, 189, , G1OMF, AT, p) -> (G1OMF, 93, , G, 1OMF, AT) -> (G, 46, null, Null, Null, 1OMF) -> (1OMF, 47, , 1, OMF, A) -> (1, 23, null, Null, Null, OMF) -> (OMF, 24, , OM, F, U) -> (OM, 12, , O, M, F) -> (O, 6, null, Null, Null, M) -> (M, 6, null, Null, Null, D;jJ)(4-) -> (F, 12, null, Null, Null, 8) -> (AT, 96, , A, T, U8'NW) -> (A, 47, null, Null, Null, T) -> (T, 49, null, Null, Null, U8') -> (p, 216, null, Null, Null, y) -> (agcs, 3351, , a, gcs, dfymt) -> (a, 1627, null, Null, Null, gcs) -> (gcs, 1724, , gc, s, dfym) -> (gc, 862, , g, c, s) -> (g, 406, null, Null, Null, c) -> (c, 456, null, Null, Null, f) -> (s, 862, null, Null, Null, d) -> (32, 7696, , dfymt, 32, ibU8'NWCSkvwrhenluD;jJ)(4-5Hx63q9LIPB.) -> (dfymt, 3797, , dfym, t, 32) -> (dfym, 1883, , d, fym, t) -> (d, 876, null, Null, Null, fym) -> (fym, 1007, , f, ym, i) -> (f, 478, null, Null, Null, ym) -> (ym, 529, , y, m, bU8'NWCSk) -> (y, 260, null, Null, Null, m) -> (m, 269, null, Null, Null, b) -> (t, 1914, null, Null, Null, ibU8'NWCSkvw) -> (32, 3899, null, Null, Null, ibU8'NWCSkvwrh) -> 

Below is inOrder of the Huffman Binary Tree
(i, 1131, null, Null, Null, bU8'NWCSkvw) -> (ibU8'NWCSkvw, 2338, , i, bU8'NWCSkvw, rh) -> (b, 271, null, Null, Null, U8'NWCSk) -> (bU8'NWCSk, 546, , b, U8'NWCSk, vw) -> (U, 25, null, Null, Null, 8') -> (U8', 53, , U, 8', NW) -> (8, 13, null, Null, Null, ') -> (8', 28, , 8, ', N) -> (', 15, null, Null, Null, D;jJ)(4-5Hx) -> (U8'NW, 120, , U8', NW, CSk) -> (N, 33, null, Null, Null, W) -> (NW, 67, , N, W, CS) -> (W, 34, null, Null, Null, C) -> (U8'NWCSk, 275, , U8'NW, CSk, v) -> (C, 34, null, Null, Null, S) -> (CS, 74, , C, S, k) -> (S, 40, null, Null, Null, D;jJ)(4-5Hx63) -> (CSk, 155, , CS, k, D;jJ)(4-5Hx63q9LIPB) -> (k, 81, null, Null, Null, D;jJ)(4-5Hx63q9L) -> (bU8'NWCSkvw, 1207, , bU8'NWCSk, vw, r) -> (v, 323, null, Null, Null, w) -> (vw, 661, , v, w, l) -> (w, 338, null, Null, Null, u) -> (ibU8'NWCSkvwrh, 4804, , ibU8'NWCSkvw, rh, enluD;jJ)(4-5Hx63q9LIPB.) -> (r, 1226, null, Null, Null, h) -> (rh, 2466, , r, h, e) -> (h, 1240, null, Null, Null, n) -> (ibU8'NWCSkvwrhenluD;jJ)(4-5Hx63q9LIPB., 10033, , ibU8'NWCSkvwrh, enluD;jJ)(4-5Hx63q9LIPB., 10) -> (e, 2547, null, Null, Null, nluD;jJ)(4-5Hx63q9LIPB.) -> (enluD;jJ)(4-5Hx63q9LIPB., 5229, , e, nluD;jJ)(4-5Hx63q9LIPB., 10) -> (n, 1321, null, Null, Null, luD;jJ)(4-5Hx63q9LIPB.) -> (nluD;jJ)(4-5Hx63q9LIPB., 2682, , n, luD;jJ)(4-5Hx63q9LIPB., 10) -> (l, 662, null, Null, Null, uD;jJ)(4-5Hx63q9LIPB.) -> (luD;jJ)(4-5Hx63q9LIPB., 1361, , l, uD;jJ)(4-5Hx63q9LIPB., o) -> (u, 343, null, Null, Null, D;jJ)(4-5Hx63q9LIPB.) -> (uD;jJ)(4-5Hx63q9LIPB., 699, , u, D;jJ)(4-5Hx63q9LIPB., 13) -> (D, 1, null, Null, Null, ;) -> (D;, 2, , D, ;, jJ) -> (;, 1, null, Null, Null, 4) -> (D;jJ, 4, , D;, jJ, )(4-) -> (j, 1, null, Null, Null, J) -> (jJ, 2, , j, J, 5) -> (J, 1, null, Null, Null, D) -> (D;jJ)(4-, 8, , D;jJ, )(4-, 5Hx) -> (), 1, null, Null, Null, () -> ()(, 2, , ), (, 4-) -> ((, 1, null, Null, Null, )() -> ()(4-, 4, , )(, 4-, 5H) -> (4, 1, null, Null, Null, -) -> (4-, 2, , 4, -, D;) -> (-, 1, null, Null, Null, )) -> (D;jJ)(4-5Hx, 19, , D;jJ)(4-, 5Hx, 63) -> (5, 2, null, Null, Null, H) -> (5H, 5, , 5, H, x) -> (H, 3, null, Null, Null, D;jJ) -> (5Hx, 11, , 5H, x, q) -> (x, 6, null, Null, Null, O) -> (D;jJ)(4-5Hx63, 41, , D;jJ)(4-5Hx, 63, q9L) -> (6, 11, null, Null, Null, 3) -> (63, 22, , 6, 3, q9) -> (3, 11, null, Null, Null, OM) -> (D;jJ)(4-5Hx63q9L, 85, , D;jJ)(4-5Hx63, q9L, IPB) -> (q, 11, null, Null, Null, 9) -> (q9, 22, , q, 9, L) -> (9, 11, null, Null, Null, 6) -> (q9L, 44, , q9, L, I) -> (L, 22, null, Null, Null, P) -> (D;jJ)(4-5Hx63q9LIPB, 175, , D;jJ)(4-5Hx63q9L, IPB, .) -> (I, 44, null, Null, Null, PB) -> (IPB, 90, , I, PB, G1OMF) -> (P, 23, null, Null, Null, B) -> (PB, 46, , P, B, G) -> (B, 23, null, Null, Null, 1) -> (D;jJ)(4-5Hx63q9LIPB., 356, , D;jJ)(4-5Hx63q9LIPB, ., ,) -> (., 181, null, Null, Null, G1OMFAT) -> (10, 24088, , ibU8'NWCSkvwrhenluD;jJ)(4-5Hx63q9LIPB., 10, Null) -> (o, 1436, null, Null, Null, 10) -> (10, 3008, , o, 10, agcs) -> (,, 373, null, Null, Null, 13) -> (13, 770, , ,, 13, 10) -> (13, 397, null, Null, Null, 10) -> (10, 1572, , 13, 10, a) -> (10, 397, null, Null, Null, G1OMFATp) -> (10, 802, , 10, G1OMFATp, gc) -> (G, 46, null, Null, Null, 1OMF) -> (G1OMF, 93, , G, 1OMF, AT) -> (1, 23, null, Null, Null, OMF) -> (1OMF, 47, , 1, OMF, A) -> (O, 6, null, Null, Null, M) -> (OM, 12, , O, M, F) -> (M, 6, null, Null, Null, D;jJ)(4-) -> (OMF, 24, , OM, F, U) -> (F, 12, null, Null, Null, 8) -> (G1OMFAT, 189, , G1OMF, AT, p) -> (A, 47, null, Null, Null, T) -> (AT, 96, , A, T, U8'NW) -> (T, 49, null, Null, Null, U8') -> (G1OMFATp, 405, , G1OMFAT, p, g) -> (p, 216, null, Null, Null, y) -> (10, 6359, , 10, agcs, 32) -> (a, 1627, null, Null, Null, gcs) -> (agcs, 3351, , a, gcs, dfymt) -> (g, 406, null, Null, Null, c) -> (gc, 862, , g, c, s) -> (c, 456, null, Null, Null, f) -> (gcs, 1724, , gc, s, dfym) -> (s, 862, null, Null, Null, d) -> (10, 14055, , 10, 32, 10) -> (d, 876, null, Null, Null, fym) -> (dfym, 1883, , d, fym, t) -> (f, 478, null, Null, Null, ym) -> (fym, 1007, , f, ym, i) -> (y, 260, null, Null, Null, m) -> (ym, 529, , y, m, bU8'NWCSk) -> (m, 269, null, Null, Null, b) -> (dfymt, 3797, , dfym, t, 32) -> (t, 1914, null, Null, Null, ibU8'NWCSkvw) -> (32, 7696, , dfymt, 32, ibU8'NWCSkvwrhenluD;jJ)(4-5Hx63q9LIPB.) -> (32, 3899, null, Null, Null, ibU8'NWCSkvwrh) -> 

Below is postOrder of the Huffman Binary Tree
(i, 1131, null, Null, Null, bU8'NWCSkvw) -> (b, 271, null, Null, Null, U8'NWCSk) -> (U, 25, null, Null, Null, 8') -> (8, 13, null, Null, Null, ') -> (', 15, null, Null, Null, D;jJ)(4-5Hx) -> (8', 28, , 8, ', N) -> (U8', 53, , U, 8', NW) -> (N, 33, null, Null, Null, W) -> (W, 34, null, Null, Null, C) -> (NW, 67, , N, W, CS) -> (U8'NW, 120, , U8', NW, CSk) -> (C, 34, null, Null, Null, S) -> (S, 40, null, Null, Null, D;jJ)(4-5Hx63) -> (CS, 74, , C, S, k) -> (k, 81, null, Null, Null, D;jJ)(4-5Hx63q9L) -> (CSk, 155, , CS, k, D;jJ)(4-5Hx63q9LIPB) -> (U8'NWCSk, 275, , U8'NW, CSk, v) -> (bU8'NWCSk, 546, , b, U8'NWCSk, vw) -> (v, 323, null, Null, Null, w) -> (w, 338, null, Null, Null, u) -> (vw, 661, , v, w, l) -> (bU8'NWCSkvw, 1207, , bU8'NWCSk, vw, r) -> (ibU8'NWCSkvw, 2338, , i, bU8'NWCSkvw, rh) -> (r, 1226, null, Null, Null, h) -> (h, 1240, null, Null, Null, n) -> (rh, 2466, , r, h, e) -> (ibU8'NWCSkvwrh, 4804, , ibU8'NWCSkvw, rh, enluD;jJ)(4-5Hx63q9LIPB.) -> (e, 2547, null, Null, Null, nluD;jJ)(4-5Hx63q9LIPB.) -> (n, 1321, null, Null, Null, luD;jJ)(4-5Hx63q9LIPB.) -> (l, 662, null, Null, Null, uD;jJ)(4-5Hx63q9LIPB.) -> (u, 343, null, Null, Null, D;jJ)(4-5Hx63q9LIPB.) -> (D, 1, null, Null, Null, ;) -> (;, 1, null, Null, Null, 4) -> (D;, 2, , D, ;, jJ) -> (j, 1, null, Null, Null, J) -> (J, 1, null, Null, Null, D) -> (jJ, 2, , j, J, 5) -> (D;jJ, 4, , D;, jJ, )(4-) -> (), 1, null, Null, Null, () -> ((, 1, null, Null, Null, )() -> ()(, 2, , ), (, 4-) -> (4, 1, null, Null, Null, -) -> (-, 1, null, Null, Null, )) -> (4-, 2, , 4, -, D;) -> ()(4-, 4, , )(, 4-, 5H) -> (D;jJ)(4-, 8, , D;jJ, )(4-, 5Hx) -> (5, 2, null, Null, Null, H) -> (H, 3, null, Null, Null, D;jJ) -> (5H, 5, , 5, H, x) -> (x, 6, null, Null, Null, O) -> (5Hx, 11, , 5H, x, q) -> (D;jJ)(4-5Hx, 19, , D;jJ)(4-, 5Hx, 63) -> (6, 11, null, Null, Null, 3) -> (3, 11, null, Null, Null, OM) -> (63, 22, , 6, 3, q9) -> (D;jJ)(4-5Hx63, 41, , D;jJ)(4-5Hx, 63, q9L) -> (q, 11, null, Null, Null, 9) -> (9, 11, null, Null, Null, 6) -> (q9, 22, , q, 9, L) -> (L, 22, null, Null, Null, P) -> (q9L, 44, , q9, L, I) -> (D;jJ)(4-5Hx63q9L, 85, , D;jJ)(4-5Hx63, q9L, IPB) -> (I, 44, null, Null, Null, PB) -> (P, 23, null, Null, Null, B) -> (B, 23, null, Null, Null, 1) -> (PB, 46, , P, B, G) -> (IPB, 90, , I, PB, G1OMF) -> (D;jJ)(4-5Hx63q9LIPB, 175, , D;jJ)(4-5Hx63q9L, IPB, .) -> (., 181, null, Null, Null, G1OMFAT) -> (D;jJ)(4-5Hx63q9LIPB., 356, , D;jJ)(4-5Hx63q9LIPB, ., ,) -> (uD;jJ)(4-5Hx63q9LIPB., 699, , u, D;jJ)(4-5Hx63q9LIPB., 13) -> (luD;jJ)(4-5Hx63q9LIPB., 1361, , l, uD;jJ)(4-5Hx63q9LIPB., o) -> (nluD;jJ)(4-5Hx63q9LIPB., 2682, , n, luD;jJ)(4-5Hx63q9LIPB., 10) -> (enluD;jJ)(4-5Hx63q9LIPB., 5229, , e, nluD;jJ)(4-5Hx63q9LIPB., 10) -> (ibU8'NWCSkvwrhenluD;jJ)(4-5Hx63q9LIPB., 10033, , ibU8'NWCSkvwrh, enluD;jJ)(4-5Hx63q9LIPB., 10) -> (o, 1436, null, Null, Null, 10) -> (,, 373, null, Null, Null, 13) -> (13, 397, null, Null, Null, 10) -> (13, 770, , ,, 13, 10) -> (10, 397, null, Null, Null, G1OMFATp) -> (G, 46, null, Null, Null, 1OMF) -> (1, 23, null, Null, Null, OMF) -> (O, 6, null, Null, Null, M) -> (M, 6, null, Null, Null, D;jJ)(4-) -> (OM, 12, , O, M, F) -> (F, 12, null, Null, Null, 8) -> (OMF, 24, , OM, F, U) -> (1OMF, 47, , 1, OMF, A) -> (G1OMF, 93, , G, 1OMF, AT) -> (A, 47, null, Null, Null, T) -> (T, 49, null, Null, Null, U8') -> (AT, 96, , A, T, U8'NW) -> (G1OMFAT, 189, , G1OMF, AT, p) -> (p, 216, null, Null, Null, y) -> (G1OMFATp, 405, , G1OMFAT, p, g) -> (10, 802, , 10, G1OMFATp, gc) -> (10, 1572, , 13, 10, a) -> (10, 3008, , o, 10, agcs) -> (a, 1627, null, Null, Null, gcs) -> (g, 406, null, Null, Null, c) -> (c, 456, null, Null, Null, f) -> (gc, 862, , g, c, s) -> (s, 862, null, Null, Null, d) -> (gcs, 1724, , gc, s, dfym) -> (agcs, 3351, , a, gcs, dfymt) -> (10, 6359, , 10, agcs, 32) -> (d, 876, null, Null, Null, fym) -> (f, 478, null, Null, Null, ym) -> (y, 260, null, Null, Null, m) -> (m, 269, null, Null, Null, b) -> (ym, 529, , y, m, bU8'NWCSk) -> (fym, 1007, , f, ym, i) -> (dfym, 1883, , d, fym, t) -> (t, 1914, null, Null, Null, ibU8'NWCSkvw) -> (dfymt, 3797, , dfym, t, 32) -> (32, 3899, null, Null, Null, ibU8'NWCSkvwrh) -> (32, 7696, , dfymt, 32, ibU8'NWCSkvwrhenluD;jJ)(4-5Hx63q9LIPB.) -> (10, 14055, , 10, 32, 10) -> (10, 24088, , ibU8'NWCSkvwrhenluD;jJ)(4-5Hx63q9LIPB., 10, Null) -> 

Index chStr Code
10    char10 100110
13    char13 100101
32    char32 111
39    char39 0001010011
40    char40 01111100000101
41    char41 01111100000100
44    char44 100100
45    char45 01111100000111
46    char46 0111111
49    char49 1001110010
51    char51 01111100011
52    char52 01111100000110
53    char53 0111110000100
54    char54 01111100010
56    char56 0001010010
57    char57 01111100101
59    char59 01111100000001
65    char65 100111010
66    char66 0111110111
67    char67 000101100
68    char68 01111100000000
70    char70 10011100111
71    char71 100111000
72    char72 0111110000101
73    char73 011111010
74    char74 01111100000011
76    char76 0111110011
77    char77 100111001101
78    char78 000101010
79    char79 100111001100
80    char80 0111110110
83    char83 000101101
84    char84 100111011
85    char85 000101000
87    char87 000101011
97    char97 1010
98    char98 000100
99    char99 101101
100    char100 11000
101    char101 010
102    char102 110010
103    char103 101100
104    char104 0011
105    char105 0000
106    char106 01111100000010
107    char107 00010111
108    char108 01110
109    char109 1100111
110    char110 0110
111    char111 1000
112    char112 1001111
113    char113 01111100100
114    char114 0010
115    char115 10111
116    char116 1101
117    char117 011110
118    char118 000110
119    char119 000111
120    char120 011111000011
121    char121 1100110

Test1.txt below
The boy visits Santiago's shack each night, 
hauling his fishing gear, preparing food, 
talking about American baseball and his favorite player, 
Joe DiMaggio. Santiago tells Manolin that on the next day, 
he will venture far out into the Gulf Stream, 
north of Cuba in the Straits of Florida to fish, 
confident that his unlucky streak is near its end.

Test1_compressed.txt below
100111011001101011100010010001100110111000110000010111000011011011111100010110110100110110100001010101100100000010100111011111110111001110101011010001011111101010101011010011111011000001011000011110110010011110010110011000111010011110011100000011010110011100110000101111111100100000101110011000001101011001111011000101010001010010011110011110010010100111110100010000001101011001111100101000100011000100100111100101100110110110100111000010111000001101011001111010000100100001111011011111001110101100111010001000001011011010011011100010010101011101000010010100111001110111101001101100011100110000101111111100101010000110100000100000110101011110011110111010101100110010001010010011110010110011001111100000011100001011101111100000000000010011100110110101011001011000000100001111111110001011011010011011010000101010110010001111101010011100111010111111100111001101101001101000011100000011011111010011101011011111000011011111010011010111011001001111100001111011111100010101100110100100111100101100110001101011100011100000111001110111000110010011011010111100010010111110010101000101111000011110110111100000110110110001111101001101011110011100001111001110110010111000101101110100100101010110011110010011110010110011001101000001011010011111100011001011100010110001111000010010101110000011011111010011010111000101101110100101010000011011011111110001100101111001110011101110100000100000110001010111110110001111100100000101110011100100111100101100110101101100001101100100000110000100110110111111010011101011011110011000010111111011110011001110011110101101000101111100110111101111101001001010100001011111100001011111101100101010001011100001101101111110100110110000111111111

Test1_decompressed.txt below
The boy visits Santiago's shack each night, 
hauling his fishing gear, preparing food, 
talking about American baseball and his favorite player, 
Joe DiMaggio. Santiago tells Manolin that on the next day, 
he will venture far out into the Gulf Stream, 
north of Cuba in the Straits of Florida to fish, 
confident that his unlucky streak is near its end.
Test2.txt below
The Gettysburg Address is a speech by U.S. President Abraham Lincoln, 
one of the best known in American history. 
It was delivered by Lincoln during the American Civil War, 
on the afternoon of Thursday, November 19, 1863, at the dedication of the Soldiers' 
National Cemetery in Gettysburg, Pennsylvania, 
four and a half months after the Union armies defeated those of the Confederacy 
at the Battle of Gettysburg.

Test2_compressed.txt below
10011101100110101111001110000101101110111001101011100010001111000101011001111001110101100011000001001010111101111110000101111111010111101111001111010010101101001111100010011001101110001010000111111000101101011111111101111101100010010101110000110000100110110111110011101000010000101010001110101100111111011111001100000110101101100001110011010010011110010110011010000110010111100011001011111010011010111000100010101111101111000101110110100000011101101110000011011110011101011001110100010000010110110100110111001100001011111011000001011001100111111111100101100110011111010110111100011110101011111111000010011100000000110010001001011000111000100110011011101111100110000011010110110000111001101111100001111000100000011010110011111010011010111100111010110011101000100000101101101001101110001011000000000110000001110111000101011101000101001001111001011001101000011011111010011010111101011001011010100010011010001000011011110001100101111001110110011011110001010111110001010110011010010011100010101010000001100101100111000100010001011110011100100111110010110010011110011100100001010010011111000100111110001110010011110101101111110100110101111100001011000000010110110101101000010000110111100011001011111010011010111000101101100001110110000000010001010111000101001111110010110011000010101010101101000010000110101001110111000101100010110011101011010100010110011011100000110111100111000010110111011100110101110001000111100010101100100100111011111011001001100110101111100110011100001101010011000001010100100111100101100110110010100001111000101111010011011000111101011100111010011101100101111100111100001101101001110111111101011001011010100010111110100110101110001010000110000010000110111101000101100111000001010111111110000101100100101010110101011000111110100111000101110101111000110010111110100110101110001011001000011011001001011000010001010101011011100110111100101100110101011011111101001101011101111101111010110111010111001011110001100101111001110000101101110111001101011100010001111000101011000111111111

Test2_decompressed.txt below
The Gettysburg Address is a speech by U.S. President Abraham Lincoln, 
one of the best known in American history. 
It was delivered by Lincoln during the American Civil War, 
on the afternoon of Thursday, November 19, 1863, at the dedication of the Soldiers' 
National Cemetery in Gettysburg, Pennsylvania, 
four and a half months after the Union armies defeated those of the Confederacy 
at the Battle of Gettysburg.

Test3.txt below
Santiago straps the marlin to the side of his skiff and heads home, 
thinking about the high price the fish will bring him at the market 
and how many people he will feed. 
On his way in to shore, sharks are attracted to the marlin's blood. 
Santiago kills a great mako shark with his harpoon, 
but he loses the weapon. 
He makes a new harpoon by strapping his knife 
to the end of an oar to help ward off the next line of sharks; 
five sharks are slain and many others are driven away. 
But the sharks keep coming, and by nightfall 
the sharks have almost devoured the marlin's entire carcass, 
leaving a skeleton consisting mostly of its backbone, its tail, 
and its head. Santiago knows that he is destroyed and 
tells the sharks of how they have killed his dreams.

Test3_compressed.txt below
0001011011010011011010000101010110010001111011111010010101010011111011111111010011010111110011110100010011100000011011111011000111110100110101111011100001100001011110001100101110011000010111111101110001011100001100101100101111010011011000111001101010101100010111111001110001100111010100100111100101100110110100110000011000010111000001101011001111010000100100001111011011111101001101011100110000101100001111110011110010000010110101011111010011010111110010000010111001111100011100000111001110111000100001000000110101100111001100001100111111101011011111101001101011111001111010001000010111010110111110010110011010100110110001110011100000011111111001111010011011001101111001111010100010011110111001011100110101110001110000011100111011111001001001011000011111111110010110011010011100110001101110011000010111111000111101011001101110000011011111011000111101110011100000100101001001111011100111010001000010111101111111010001001011110101101110100101010101101110101011000111110110001111101001101011111001111010001001110000001100001010011101111110001000111010001000110000111111111100101100110000101101101001101101000010101011001000111000101110000011100111010111111101011110110000100101010110111111001111010000101111000111101110011101000100001011111100011100001101001111100110000101111110011101000101001111100010000110100100111100101100110000100011110110111100110101110111010001011101010111111110100110101110001110101010100111110000110011111111110010110011001111100001010101111100111101000010111010101111111010111011001000011111100111010001010011111000100001101110001001100110111101111101001010101001111100111100000110101100111001100001011111100010111011000001100100101111001011001101101100011111010011010111010011011000111100011001011110100110111100010100010111110110001110011010011101001111111000111101000101100011110001100101100101111101001101011101100100111110000111101111011100000011001011110001100101111011100111010001000010111101110111110000000111110010110011011001000000001100101111011100111010001000010111101111111010001001011110111011101010000001101111010011011000111110011110100110110011011110001101001101000101011111110100010010111110000010000000011001001101111010000111101011001100111111111100101100110011111011101111011011111101001101011110111001110100010000101111011111100010111010010100111111110110110001100111000001101011001001001111010011011000111000100110011011101100000101100001111011100101010011100111011110010110011011010011010111101110011101000100001011110111111001110100001100101111010011101100111100010111110111111000010000110100001111000100101100011111010011010111110011110100010011100000011000010100111011111101001101101000000100101111011011010001010110110101011110111100100111100101100110011100101010000110000001101011001111010111101110001011101001110010110110000110111101101100001101011100001011111010000011010110011111001111000101111101011101100110111100011001011100001101101111110001001010101101000101110001001000011001010010011100001101101111111101101000000111010010011110010110011010100110110001110000110110111111001101010101100001111111110001011011010011011010000101010110010001110001011101101000000111101111111101001110101101111001101011100001011111111000010101111101001010001100110010110001111010011011000111100101100110110101001110011101011111111010011010111101110011101000100001011110111111100011001011100111000000111111110100110101100110111001110100001100101110001011100000111001110010110001110011000010111111110000010010101011001111011101111111

Test3_decompressed.txt below
Santiago straps the marlin to the side of his skiff and heads home, 
thinking about the high price the fish will bring him at the market 
and how many people he will feed. 
On his way in to shore, sharks are attracted to the marlin's blood. 
Santiago kills a great mako shark with his harpoon, 
but he loses the weapon. 
He makes a new harpoon by strapping his knife 
to the end of an oar to help ward off the next line of sharks; 
five sharks are slain and many others are driven away. 
But the sharks keep coming, and by nightfall 
the sharks have almost devoured the marlin's entire carcass, 
leaving a skeleton consisting mostly of its backbone, its tail, 
and its head. Santiago knows that he is destroyed and 
tells the sharks of how they have killed his dreams.

Debug file below
Entering Encode method
Index: 84 Code: 100111011 inside Encode ()
Index: 104 Code: 0011 inside Encode ()
Index: 101 Code: 010 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 98 Code: 000100 inside Encode ()
Index: 111 Code: 1000 inside Encode ()
Index: 121 Code: 1100110 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 118 Code: 000110 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 115 Code: 10111 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 116 Code: 1101 inside Encode ()
Index: 115 Code: 10111 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 83 Code: 000101101 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 116 Code: 1101 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 103 Code: 101100 inside Encode ()
Index: 111 Code: 1000 inside Encode ()
Index: 39 Code: 0001010011 inside Encode ()
Index: 115 Code: 10111 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 115 Code: 10111 inside Encode ()
Index: 104 Code: 0011 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 99 Code: 101101 inside Encode ()
Index: 107 Code: 00010111 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 101 Code: 010 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 99 Code: 101101 inside Encode ()
Index: 104 Code: 0011 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 103 Code: 101100 inside Encode ()
Index: 104 Code: 0011 inside Encode ()
Index: 116 Code: 1101 inside Encode ()
Index: 44 Code: 100100 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 13 Code: 100101 inside Encode ()
Index: 10 Code: 100110 inside Encode ()
Index: 104 Code: 0011 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 117 Code: 011110 inside Encode ()
Index: 108 Code: 01110 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 103 Code: 101100 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 104 Code: 0011 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 115 Code: 10111 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 102 Code: 110010 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 115 Code: 10111 inside Encode ()
Index: 104 Code: 0011 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 103 Code: 101100 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 103 Code: 101100 inside Encode ()
Index: 101 Code: 010 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 114 Code: 0010 inside Encode ()
Index: 44 Code: 100100 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 112 Code: 1001111 inside Encode ()
Index: 114 Code: 0010 inside Encode ()
Index: 101 Code: 010 inside Encode ()
Index: 112 Code: 1001111 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 114 Code: 0010 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 103 Code: 101100 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 102 Code: 110010 inside Encode ()
Index: 111 Code: 1000 inside Encode ()
Index: 111 Code: 1000 inside Encode ()
Index: 100 Code: 11000 inside Encode ()
Index: 44 Code: 100100 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 13 Code: 100101 inside Encode ()
Index: 10 Code: 100110 inside Encode ()
Index: 116 Code: 1101 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 108 Code: 01110 inside Encode ()
Index: 107 Code: 00010111 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 103 Code: 101100 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 98 Code: 000100 inside Encode ()
Index: 111 Code: 1000 inside Encode ()
Index: 117 Code: 011110 inside Encode ()
Index: 116 Code: 1101 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 65 Code: 100111010 inside Encode ()
Index: 109 Code: 1100111 inside Encode ()
Index: 101 Code: 010 inside Encode ()
Index: 114 Code: 0010 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 99 Code: 101101 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 98 Code: 000100 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 115 Code: 10111 inside Encode ()
Index: 101 Code: 010 inside Encode ()
Index: 98 Code: 000100 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 108 Code: 01110 inside Encode ()
Index: 108 Code: 01110 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 100 Code: 11000 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 104 Code: 0011 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 115 Code: 10111 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 102 Code: 110010 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 118 Code: 000110 inside Encode ()
Index: 111 Code: 1000 inside Encode ()
Index: 114 Code: 0010 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 116 Code: 1101 inside Encode ()
Index: 101 Code: 010 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 112 Code: 1001111 inside Encode ()
Index: 108 Code: 01110 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 121 Code: 1100110 inside Encode ()
Index: 101 Code: 010 inside Encode ()
Index: 114 Code: 0010 inside Encode ()
Index: 44 Code: 100100 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 13 Code: 100101 inside Encode ()
Index: 10 Code: 100110 inside Encode ()
Index: 74 Code: 01111100000011 inside Encode ()
Index: 111 Code: 1000 inside Encode ()
Index: 101 Code: 010 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 68 Code: 01111100000000 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 77 Code: 100111001101 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 103 Code: 101100 inside Encode ()
Index: 103 Code: 101100 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 111 Code: 1000 inside Encode ()
Index: 46 Code: 0111111 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 83 Code: 000101101 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 116 Code: 1101 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 103 Code: 101100 inside Encode ()
Index: 111 Code: 1000 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 116 Code: 1101 inside Encode ()
Index: 101 Code: 010 inside Encode ()
Index: 108 Code: 01110 inside Encode ()
Index: 108 Code: 01110 inside Encode ()
Index: 115 Code: 10111 inside Encode ()
Index: 32 Code: 111 inside Encode ()
Index: 77 Code: 100111001101 inside Encode ()
Index: 97 Code: 1010 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 111 Code: 1000 inside Encode ()
Index: 108 Code: 01110 inside Encode ()
Index: 105 Code: 0000 inside Encode ()
Index: 110 Code: 0110 inside Encode ()
Index: 32 Code: 111 inside Encode ()
