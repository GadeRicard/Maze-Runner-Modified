import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(20, 20, 40); 
        prepare();
    }
    
    public void checkLose()
    {
        showText("The Maze has been Failed.", getWidth()/2,getHeight()/2);
        Greenfoot.stop();
    }
    
    public void checkWin()
    {
        showText("The Maze has been Completed!", getWidth()/2,getHeight()/2);
        Greenfoot.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,0,0);
        Wall wall2 = new Wall();
        addObject(wall2,1,0);
        Wall wall3 = new Wall();
        addObject(wall3,2,0);
        Wall wall4 = new Wall();
        addObject(wall4,3,0);
        Wall wall5 = new Wall();
        addObject(wall5,4,0);
        Wall wall6 = new Wall();
        addObject(wall6,5,0);
        Wall wall7 = new Wall();
        addObject(wall7,6,0);
        Wall wall8 = new Wall();
        addObject(wall8,7,0);
        Wall wall9 = new Wall();
        addObject(wall9,8,0);
        Wall wall10 = new Wall();
        addObject(wall10,9,0);
        Wall wall11 = new Wall();
        addObject(wall11,10,0);
        Wall wall12 = new Wall();
        addObject(wall12,11,0);
        Wall wall13 = new Wall();
        addObject(wall13,12,0);
        Wall wall14 = new Wall();
        addObject(wall14,13,0);
        Wall wall15 = new Wall();
        addObject(wall15,15,0);
        Wall wall16 = new Wall();
        addObject(wall16,16,0);
        Wall wall17 = new Wall();
        addObject(wall17,14,0);
        Wall wall18 = new Wall();
        addObject(wall18,18,0);
        Wall wall19 = new Wall();
        addObject(wall19,17,0);
        Wall wall20 = new Wall();
        addObject(wall20,19,0);
        Wall wall21 = new Wall();
        addObject(wall21,19,1);
        Wall wall22 = new Wall();
        addObject(wall22,19,2);
        Wall wall23 = new Wall();
        addObject(wall23,19,3);
        Wall wall24 = new Wall();
        addObject(wall24,19,4);
        Wall wall25 = new Wall();
        addObject(wall25,19,5);
        Wall wall26 = new Wall();
        addObject(wall26,19,6);
        Wall wall27 = new Wall();
        addObject(wall27,19,7);
        Wall wall28 = new Wall();
        addObject(wall28,19,8);
        Wall wall29 = new Wall();
        addObject(wall29,19,9);
        Wall wall30 = new Wall();
        addObject(wall30,19,10);
        Wall wall31 = new Wall();
        addObject(wall31,19,11);
        Wall wall32 = new Wall();
        addObject(wall32,19,12);
        Wall wall33 = new Wall();
        addObject(wall33,19,13);
        Wall wall34 = new Wall();
        addObject(wall34,19,14);
        Wall wall35 = new Wall();
        addObject(wall35,19,15);
        Wall wall36 = new Wall();
        addObject(wall36,19,15);
        Wall wall37 = new Wall();
        addObject(wall37,19,17);
        Wall wall38 = new Wall();
        addObject(wall38,19,16);
        Wall wall39 = new Wall();
        addObject(wall39,19,18);
        Wall wall40 = new Wall();
        addObject(wall40,19,19);
        Wall wall41 = new Wall();
        addObject(wall41,0,19);
        Wall wall42 = new Wall();
        addObject(wall42,0,18);
        Wall wall43 = new Wall();
        addObject(wall43,0,17);
        Wall wall44 = new Wall();
        addObject(wall44,0,16);
        Wall wall45 = new Wall();
        addObject(wall45,0,15);
        Wall wall46 = new Wall();
        addObject(wall46,0,13);
        Wall wall47 = new Wall();
        addObject(wall47,0,14);
        Wall wall48 = new Wall();
        addObject(wall48,0,12);
        Wall wall49 = new Wall();
        addObject(wall49,0,11);
        Wall wall50 = new Wall();
        addObject(wall50,0,10);
        Wall wall51 = new Wall();
        addObject(wall51,0,9);
        Wall wall52 = new Wall();
        addObject(wall52,0,8);
        Wall wall53 = new Wall();
        addObject(wall53,0,6);
        Wall wall54 = new Wall();
        addObject(wall54,0,7);
        Wall wall55 = new Wall();
        addObject(wall55,0,5);
        Wall wall56 = new Wall();
        addObject(wall56,0,4);
        Wall wall57 = new Wall();
        addObject(wall57,0,3);
        Wall wall58 = new Wall();
        addObject(wall58,0,2);
        Wall wall59 = new Wall();
        addObject(wall59,0,1);
        Wall wall60 = new Wall();
        addObject(wall60,1,19);
        Wall wall61 = new Wall();
        addObject(wall61,2,19);
        Wall wall62 = new Wall();
        addObject(wall62,2,19);
        Wall wall63 = new Wall();
        addObject(wall63,4,19);
        Wall wall64 = new Wall();
        addObject(wall64,3,19);
        Wall wall65 = new Wall();
        addObject(wall65,6,19);
        Wall wall66 = new Wall();
        addObject(wall66,5,19);
        Wall wall67 = new Wall();
        addObject(wall67,7,19);
        Wall wall68 = new Wall();
        addObject(wall68,8,19);
        Wall wall69 = new Wall();
        addObject(wall69,9,19);
        Wall wall70 = new Wall();
        addObject(wall70,10,19);
        Wall wall71 = new Wall();
        addObject(wall71,11,19);
        Wall wall72 = new Wall();
        addObject(wall72,12,19);
        Wall wall73 = new Wall();
        addObject(wall73,14,19);
        Wall wall74 = new Wall();
        addObject(wall74,13,19);
        Wall wall75 = new Wall();
        addObject(wall75,15,19);
        Wall wall76 = new Wall();
        addObject(wall76,16,19);
        Wall wall77 = new Wall();
        addObject(wall77,18,19);
        Wall wall78 = new Wall();
        addObject(wall78,17,19);
        removeObject(wall59);
        removeObject(wall40);
        Wall wall79 = new Wall();
        addObject(wall79,19,19);
        removeObject(wall39);
        MazeWalker walker = new MazeWalker();
        addObject(walker,0,1);
        WinningSpace winningspace = new WinningSpace();
        addObject(winningspace,19,18);
        Wall wall80 = new Wall();
        addObject(wall80,1,2);
        Wall wall81 = new Wall();
        addObject(wall81,2,2);
        Wall wall82 = new Wall();
        addObject(wall82,3,2);
        Wall wall83 = new Wall();
        addObject(wall83,5,2);
        Wall wall84 = new Wall();
        addObject(wall84,4,2);
        removeObject(wall82);
        Wall wall85 = new Wall();
        addObject(wall85,2,3);
        Wall wall86 = new Wall();
        addObject(wall86,4,3);
        Wall wall87 = new Wall();
        addObject(wall87,2,4);
        Wall wall88 = new Wall();
        addObject(wall88,2,5);
        Wall wall89 = new Wall();
        addObject(wall89,6,2);
        Wall wall90 = new Wall();
        addObject(wall90,7,2);
        Wall wall91 = new Wall();
        addObject(wall91,7,3);
        Wall wall92 = new Wall();
        addObject(wall92,4,4);
        Wall wall93 = new Wall();
        addObject(wall93,4,5);
        Wall wall94 = new Wall();
        addObject(wall94,5,5);
        Wall wall95 = new Wall();
        addObject(wall95,6,5);
        Wall wall96 = new Wall();
        addObject(wall96,7,5);
        Wall wall97 = new Wall();
        addObject(wall97,7,4);
        Wall wall98 = new Wall();
        addObject(wall98,2,6);
        Wall wall99 = new Wall();
        addObject(wall99,2,7);
        Wall wall100 = new Wall();
        addObject(wall100,4,6);
        Wall wall101 = new Wall();
        addObject(wall101,4,7);
        Wall wall102 = new Wall();
        addObject(wall102,4,8);
        Wall wall103 = new Wall();
        addObject(wall103,4,9);
        Wall wall104 = new Wall();
        addObject(wall104,3,9);
        Wall wall105 = new Wall();
        addObject(wall105,2,9);
        Wall wall106 = new Wall();
        addObject(wall106,1,7);
        Wall wall107 = new Wall();
        addObject(wall107,1,11);
        Wall wall108 = new Wall();
        addObject(wall108,2,11);
        Wall wall109 = new Wall();
        addObject(wall109,3,11);
        Wall wall110 = new Wall();
        addObject(wall110,4,11);
        Wall wall111 = new Wall();
        addObject(wall111,3,4);
        removeObject(wall85);
        removeObject(wall98);
        Wall wall112 = new Wall();
        addObject(wall112,4,12);
        Wall wall113 = new Wall();
        addObject(wall113,4,13);
        Wall wall114 = new Wall();
        addObject(wall114,4,14);
        Wall wall115 = new Wall();
        addObject(wall115,3,14);
        Wall wall116 = new Wall();
        addObject(wall116,1,14);
        Wall wall117 = new Wall();
        addObject(wall117,1,13);
        Wall wall118 = new Wall();
        addObject(wall118,1,13);
        Wall wall119 = new Wall();
        addObject(wall119,1,12);
        Wall wall120 = new Wall();
        addObject(wall120,2,12);
        Wall wall121 = new Wall();
        addObject(wall121,3,12);
        removeObject(wall121);
        removeObject(wall120);
        removeObject(wall119);
        Wall wall122 = new Wall();
        addObject(wall122,3,15);
        Wall wall123 = new Wall();
        addObject(wall123,3,16);
        Wall wall124 = new Wall();
        addObject(wall124,6,10);
        Wall wall125 = new Wall();
        addObject(wall125,6,9);
        Wall wall126 = new Wall();
        addObject(wall126,6,8);
        Wall wall127 = new Wall();
        addObject(wall127,6,11);
        Wall wall128 = new Wall();
        addObject(wall128,5,13);
        Wall wall129 = new Wall();
        addObject(wall129,6,13);
        Wall wall130 = new Wall();
        addObject(wall130,7,11);
        Wall wall131 = new Wall();
        addObject(wall131,8,12);
        Wall wall132 = new Wall();
        addObject(wall132,8,13);
        Wall wall133 = new Wall();
        addObject(wall133,8,11);
        Wall wall134 = new Wall();
        addObject(wall134,8,14);
        Wall wall135 = new Wall();
        addObject(wall135,7,14);
        Wall wall136 = new Wall();
        addObject(wall136,6,14);
        removeObject(wall135);
        Wall wall137 = new Wall();
        addObject(wall137,8,15);
        Wall wall138 = new Wall();
        addObject(wall138,8,16);
        Wall wall139 = new Wall();
        addObject(wall139,7,16);
        Wall wall140 = new Wall();
        addObject(wall140,6,16);
        removeObject(wall128);
        removeObject(wall129);
        removeObject(wall136);
        Wall wall141 = new Wall();
        addObject(wall141,5,13);
        Wall wall142 = new Wall();
        addObject(wall142,6,13);
        Wall wall143 = new Wall();
        addObject(wall143,6,14);
        Wall wall144 = new Wall();
        addObject(wall144,5,14);
        Wall wall145 = new Wall();
        addObject(wall145,4,15);
        Wall wall146 = new Wall();
        addObject(wall146,4,16);
        removeObject(wall123);
        removeObject(wall122);
        removeObject(wall115);
        Wall wall147 = new Wall();
        addObject(wall147,6,17);
        Wall wall148 = new Wall();
        addObject(wall148,4,17);
        Wall wall149 = new Wall();
        addObject(wall149,2,18);
        Wall wall150 = new Wall();
        addObject(wall150,1,18);
        Wall wall151 = new Wall();
        addObject(wall151,1,17);
        Wall wall152 = new Wall();
        addObject(wall152,1,16);
        Wall wall153 = new Wall();
        addObject(wall153,1,15);
        Wall wall154 = new Wall();
        addObject(wall154,2,15);
        Wall wall155 = new Wall();
        addObject(wall155,2,16);
        Wall wall156 = new Wall();
        addObject(wall156,2,17);
        Wall wall157 = new Wall();
        addObject(wall157,2,14);
        Wall wall158 = new Wall();
        addObject(wall158,2,13);
        Wall wall159 = new Wall();
        addObject(wall159,7,17);
        Wall wall160 = new Wall();
        addObject(wall160,8,17);
        Wall wall161 = new Wall();
        addObject(wall161,9,17);
        Wall wall162 = new Wall();
        addObject(wall162,11,17);
        Wall wall163 = new Wall();
        addObject(wall163,11,16);
        Wall wall164 = new Wall();
        addObject(wall164,11,15);
        Wall wall165 = new Wall();
        addObject(wall165,11,14);
        Wall wall166 = new Wall();
        addObject(wall166,9,16);
        Wall wall167 = new Wall();
        addObject(wall167,9,15);
        Wall wall168 = new Wall();
        addObject(wall168,9,15);
        Wall wall169 = new Wall();
        addObject(wall169,9,14);
        Wall wall170 = new Wall();
        addObject(wall170,9,13);
        Wall wall171 = new Wall();
        addObject(wall171,9,12);
        Wall wall172 = new Wall();
        addObject(wall172,9,11);
        Wall wall173 = new Wall();
        addObject(wall173,10,12);
        Wall wall174 = new Wall();
        addObject(wall174,11,12);
        Wall wall175 = new Wall();
        addObject(wall175,12,12);
        Wall wall176 = new Wall();
        addObject(wall176,13,13);
        Wall wall177 = new Wall();
        addObject(wall177,13,14);
        Wall wall178 = new Wall();
        addObject(wall178,13,12);
        Wall wall179 = new Wall();
        addObject(wall179,13,15);
        Wall wall180 = new Wall();
        addObject(wall180,13,16);
        Wall wall181 = new Wall();
        addObject(wall181,13,17);
        Wall wall182 = new Wall();
        addObject(wall182,13,18);
        Wall wall183 = new Wall();
        addObject(wall183,8,2);
        Wall wall184 = new Wall();
        addObject(wall184,9,2);
        Wall wall185 = new Wall();
        addObject(wall185,11,2);
        Wall wall186 = new Wall();
        addObject(wall186,12,2);
        Wall wall187 = new Wall();
        addObject(wall187,13,2);
        Wall wall188 = new Wall();
        addObject(wall188,14,1);
        Wall wall189 = new Wall();
        addObject(wall189,14,2);
        Wall wall190 = new Wall();
        addObject(wall190,9,3);
        Wall wall191 = new Wall();
        addObject(wall191,11,3);
        Wall wall192 = new Wall();
        addObject(wall192,11,4);
        Wall wall193 = new Wall();
        addObject(wall193,9,4);
        Wall wall194 = new Wall();
        addObject(wall194,11,5);
        Wall wall195 = new Wall();
        addObject(wall195,9,5);
        Wall wall196 = new Wall();
        addObject(wall196,9,7);
        Wall wall197 = new Wall();
        addObject(wall197,10,7);
        Wall wall198 = new Wall();
        addObject(wall198,11,7);
        Wall wall199 = new Wall();
        addObject(wall199,8,7);
        Wall wall200 = new Wall();
        addObject(wall200,7,7);
        Wall wall201 = new Wall();
        addObject(wall201,6,7);
        Wall wall202 = new Wall();
        addObject(wall202,12,5);
        Wall wall203 = new Wall();
        addObject(wall203,13,5);
        Wall wall204 = new Wall();
        addObject(wall204,16,5);
        Wall wall205 = new Wall();
        addObject(wall205,15,5);
        Wall wall206 = new Wall();
        addObject(wall206,13,4);
        Wall wall207 = new Wall();
        addObject(wall207,13,3);
        Wall wall208 = new Wall();
        addObject(wall208,12,4);
        Wall wall209 = new Wall();
        addObject(wall209,12,3);
        Wall wall210 = new Wall();
        addObject(wall210,5,3);
        Wall wall211 = new Wall();
        addObject(wall211,6,3);
        Wall wall212 = new Wall();
        addObject(wall212,6,4);
        Wall wall213 = new Wall();
        addObject(wall213,6,4);
        Wall wall214 = new Wall();
        addObject(wall214,5,4);
        Wall wall215 = new Wall();
        addObject(wall215,12,7);
        Wall wall216 = new Wall();
        addObject(wall216,12,8);
        Wall wall217 = new Wall();
        addObject(wall217,14,7);
        Wall wall218 = new Wall();
        addObject(wall218,14,8);
        Wall wall219 = new Wall();
        addObject(wall219,15,7);
        Wall wall220 = new Wall();
        addObject(wall220,16,7);
        Wall wall221 = new Wall();
        addObject(wall221,17,7);
        Wall wall222 = new Wall();
        addObject(wall222,18,7);
        Wall wall223 = new Wall();
        addObject(wall223,18,6);
        Wall wall224 = new Wall();
        addObject(wall224,17,6);
        Wall wall225 = new Wall();
        addObject(wall225,17,5);
        removeObject(wall224);
        removeObject(wall223);
        Wall wall226 = new Wall();
        addObject(wall226,15,4);
        Wall wall227 = new Wall();
        addObject(wall227,15,2);
        Wall wall228 = new Wall();
        addObject(wall228,15,1);
        Wall wall229 = new Wall();
        addObject(wall229,16,1);
        Wall wall230 = new Wall();
        addObject(wall230,17,1);
        Wall wall231 = new Wall();
        addObject(wall231,18,1);
        Wall wall232 = new Wall();
        addObject(wall232,16,2);
        Wall wall233 = new Wall();
        addObject(wall233,17,2);
        Wall wall234 = new Wall();
        addObject(wall234,18,2);
        Wall wall235 = new Wall();
        addObject(wall235,16,4);
        Wall wall236 = new Wall();
        addObject(wall236,17,4);
        Wall wall237 = new Wall();
        addObject(wall237,17,4);
        Wall wall238 = new Wall();
        addObject(wall238,12,9);
        Wall wall239 = new Wall();
        addObject(wall239,12,11);
        Wall wall240 = new Wall();
        addObject(wall240,11,11);
        Wall wall241 = new Wall();
        addObject(wall241,11,11);
        Wall wall242 = new Wall();
        addObject(wall242,10,11);
        Wall wall243 = new Wall();
        addObject(wall243,11,9);
        Wall wall244 = new Wall();
        addObject(wall244,10,9);
        Wall wall245 = new Wall();
        addObject(wall245,8,9);
        Wall wall246 = new Wall();
        addObject(wall246,7,9);
        Wall wall247 = new Wall();
        addObject(wall247,7,10);
        Wall wall248 = new Wall();
        addObject(wall248,7,8);
        Wall wall249 = new Wall();
        addObject(wall249,13,11);
        Wall wall250 = new Wall();
        addObject(wall250,14,11);
        Wall wall251 = new Wall();
        addObject(wall251,15,11);
        Wall wall252 = new Wall();
        addObject(wall252,15,12);
        Wall wall253 = new Wall();
        addObject(wall253,15,13);
        Wall wall254 = new Wall();
        addObject(wall254,16,14);
        Wall wall255 = new Wall();
        addObject(wall255,15,14);
        Wall wall256 = new Wall();
        addObject(wall256,17,14);
        Wall wall257 = new Wall();
        addObject(wall257,18,12);
        Wall wall258 = new Wall();
        addObject(wall258,17,12);
        Wall wall259 = new Wall();
        addObject(wall259,17,11);
        Wall wall260 = new Wall();
        addObject(wall260,17,10);
        Wall wall261 = new Wall();
        addObject(wall261,17,9);
        Wall wall262 = new Wall();
        addObject(wall262,16,9);
        Wall wall263 = new Wall();
        addObject(wall263,15,9);
        removeObject(wall263);
        Wall wall264 = new Wall();
        addObject(wall264,14,9);
        Wall wall265 = new Wall();
        addObject(wall265,17,15);
        Wall wall266 = new Wall();
        addObject(wall266,17,17);
        Wall wall267 = new Wall();
        addObject(wall267,18,17);
        Wall wall268 = new Wall();
        addObject(wall268,16,17);
        Wall wall269 = new Wall();
        addObject(wall269,15,16);
        Wall wall270 = new Wall();
        addObject(wall270,15,17);
        removeObject(wall86);
        removeObject(wall210);
        removeObject(wall214);
        removeObject(wall213);
        removeObject(wall188);
        removeObject(wall228);
        removeObject(wall229);
        removeObject(wall230);
        Wall wall271 = new Wall();
        addObject(wall271,18,5);
        Wall wall272 = new Wall();
        addObject(wall272,18,4);
        removeObject(wall271);
        removeObject(wall207);
        removeObject(wall209);
        removeObject(wall208);
        removeObject(wall158);
        removeObject(wall157);
        Wall wall273 = new Wall();
        addObject(wall273,2,13);
        removeObject(wall116);
        removeObject(wall153);
        Wall wall274 = new Wall();
        addObject(wall274,3,15);
        removeObject(wall152);
        removeObject(wall155);
        Wall wall275 = new Wall();
        addObject(wall275,3,17);
        removeObject(wall149);
        removeObject(wall150);
        removeObject(wall151);
        Wall wall276 = new Wall();
        addObject(wall276,1,15);
        removeObject(wall274);
        Wall wall277 = new Wall();
        addObject(wall277,3,13);
        removeObject(wall118);
        removeObject(wall117);
        Wall wall278 = new Wall();
        addObject(wall278,18,3);
        Wall wall279 = new Wall();
        addObject(wall279,17,3);
        Wall wall280 = new Wall();
        addObject(wall280,16,3);
        Wall wall281 = new Wall();
        addObject(wall281,15,3);
        Wall wall282 = new Wall();
        addObject(wall282,14,3);
        Wall wall283 = new Wall();
        addObject(wall283,14,3);
        Wall wall284 = new Wall();
        addObject(wall284,13,3);
        Wall wall285 = new Wall();
        addObject(wall285,12,3);
        Wall wall286 = new Wall();
        addObject(wall286,12,4);
        Wall wall287 = new Wall();
        addObject(wall287,14,4);
        Wall wall288 = new Wall();
        addObject(wall288,14,5);
        Wall wall289 = new Wall();
        addObject(wall289,18,5);
        removeObject(wall227);
        removeObject(wall281);
        removeObject(wall283);
        removeObject(wall282);
        removeObject(wall284);
        removeObject(wall285);
        removeObject(wall286);
        removeObject(wall226);
        removeObject(wall235);
        removeObject(wall237);
        removeObject(wall272);
        removeObject(wall236);
        removeObject(wall278);
        removeObject(wall211);
        removeObject(wall288);
        Wall wall290 = new Wall();
        addObject(wall290,15,4);
        removeObject(wall280);
        removeObject(wall248);
        removeObject(wall246);
        Wall wall291 = new Wall();
        addObject(wall291,8,10);
        removeObject(wall247);
        removeObject(wall141);
        removeObject(wall142);
        Wall wall292 = new Wall();
        addObject(wall292,7,12);
        Wall wall293 = new Wall();
        addObject(wall293,6,12);
        removeObject(wall130);
        removeObject(wall139);
        removeObject(wall140);
        Wall wall294 = new Wall();
        addObject(wall294,5,15);
        Wall wall295 = new Wall();
        addObject(wall295,6,15);
        removeObject(wall143);
        removeObject(wall144);
        Wall wall296 = new Wall();
        addObject(wall296,7,13);
        Wall wall297 = new Wall();
        addObject(wall297,6,13);
        removeObject(wall292);
        removeObject(wall131);
        Wall wall298 = new Wall();
        addObject(wall298,10,13);
        removeObject(wall171);
        removeObject(wall169);
        removeObject(wall170);
        Wall wall299 = new Wall();
        addObject(wall299,11,13);
        removeObject(wall173);
        removeObject(wall166);
        removeObject(wall175);
        removeObject(wall179);
        Wall wall300 = new Wall();
        addObject(wall300,15,15);
        removeObject(wall212);
        Wall wall301 = new Wall();
        addObject(wall301,5,4);
        Wall wall302 = new Wall();
        addObject(wall302,10,17);
        Wall wall303 = new Wall();
        addObject(wall303,10,5);
        removeObject(wall178);
        removeObject(wall176);
        Wall wall304 = new Wall();
        addObject(wall304,14,13);
        Wall wall305 = new Wall();
        addObject(wall305,13,13);
        removeObject(wall177);
        Wall wall306 = new Wall();
        addObject(wall306,13,15);
        Wall wall307 = new Wall();
        addObject(wall307,14,15);
        removeObject(wall180);
        Wall wall308 = new Wall();
        addObject(wall308,14,16);
        removeObject(wall308);
        removeObject(wall301);
        Wall wall309 = new Wall();
        addObject(wall309,6,4);
        removeObject(wall96);
        Wall wall310 = new Wall();
        addObject(wall310,7,5);
        Wall wall311 = new Wall();
        addObject(wall311,5,4);
        removeObject(wall309);
        Player player = new Player();
        addObject(player,0,1);
    }
}
