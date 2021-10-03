import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Scope
 * Class: StringUtility
 * Method: public String ReverseString(String input)
 *
 * Test framework
 * Name: junit-jupiter
 * Version: 5.8.1
 *
 * Some string test examples are taken from this list on GitHub:
 * https://github.com/minimaxir/big-list-of-naughty-strings
 * Props to this guy ↑↑↑
 *
 * @author Anders
 */
public class StringUtilityReverseStringTest {

    @Test
    public void reverseString_threeMixedLetters_cBa() {
        String input = "aBc";

        String actual = StringUtility.reverse(input);
        String expected = "cBa";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_fourMixedLetters_cBBa() {
        String input = "aBBc";

        String actual = StringUtility.reverse(input);
        String expected =  "cBBa";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_eightMixedLetters_tEbAhPlA() {
        String input = "AlPhAbEt";

        String actual = StringUtility.reverse(input);
        String expected =  "tEbAhPlA";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_mixedLettersAndNumbers_2540w708dsvcnkLDSL() {
        String input = "LSDLkncvsd807w0452";

        String actual = StringUtility.reverse(input);
        String expected =  "2540w708dsvcnkLDSL";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_emptyString_emptyString() {
        String input = "";

        String actual = StringUtility.reverse(input);
        String expected =  "";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_oneLetter_Q() {
        String input = "Q";

        String actual = StringUtility.reverse(input);
        String expected =  "Q";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_twoLetters_Qr() {
        String input = "rQ";

        String actual = StringUtility.reverse(input);
        String expected =  "Qr";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_specialCharacters_specialCharactersReversed() {
        String input = "!#¤%&/()=:;,.-<>*+@£$€{[]}|¨";

        String actual = StringUtility.reverse(input);
        String expected =  "¨|}][{€$£@+*><-.,;:=)(/&%¤#!";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_newLine_newLine() {
        String input = "\n";

        String actual = StringUtility.reverse(input);
        String expected =  "\n";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_stringContainingNewLine_reversedStringContainingNewLine() {
        String input = "anders\nanders";

        String actual = StringUtility.reverse(input);
        String expected =  "sredna\nsredna";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_tabulator_tabulator() {
        String input = "\t";

        String actual = StringUtility.reverse(input);
        String expected =  "\t";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_stringContainingTabulator_stringContainingTabulator() {
        String input = "AB123BA\tAB123BA";

        String actual = StringUtility.reverse(input);
        String expected =  "AB321BA\tAB321BA";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_onlySpaces_onlySpaces() {
        String input = "          ";

        String actual = StringUtility.reverse(input);
        String expected =  "          ";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_null_null() {
        String input = null;
        @SuppressWarnings({"null", "ConstantConditions"})
        String actual = StringUtility.reverse(input);
        String expected = null;

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_twiceReversedShouldBeSameAsInput_sameAsInput() {
        String input = "ABCDEFGHIJKLMN123456789";
        // reversing the input twice
        String actual = StringUtility.reverse(StringUtility.reverse(input));
        String expected = "ABCDEFGHIJKLMN123456789";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_unicode_unicodeReversed() {
        String input = "\uD83D\uDE00 \uD83D\uDE03 \uD83D\uDE04";

        String actual = StringUtility.reverse(input);
        String expected = "\uD83D\uDE04 \uD83D\uDE03 \uD83D\uDE00";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_unicodeAndCharacters_unicodeAndCharactersReversed() {
        String input = "\uD83D\uDE00 ABC \uD83D\uDE03 ABC \uD83D\uDE04";

        String actual = StringUtility.reverse(input);
        String expected = "\uD83D\uDE04 CBA \uD83D\uDE03 CBA \uD83D\uDE00";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_200Characters_200CharactersReversed() {
        String input = "EFckuateeaVA8GPC0EFYcUxkW9jDSTN3Hzf3D5RFI2aIWVmcGSsRA0k01JAeaA0AtfVA8v2ewZ2VJz2fVRhQLf0UPTsaDxEjD1Rc3zZvnKFyEVxMGP584lYI3JDSIv0n1s4WESf5r7CN4797AZesf9GBo9aKlknXxVUHxOCW9fUwcGcqQeZM2lv4KWpmR3VOGyU6iirz";

        String actual = StringUtility.reverse(input);
        String expected = "zrii6UyGOV3RmpWK4vl2MZeQqcGcwUf9WCOxHUVxXnklKa9oBG9fseZA7974NC7r5fSEW4s1n0vISDJ3IYl485PGMxVEyFKnvZz3cR1DjExDasTPU0fLQhRVf2zJV2Zwe2v8AVftA0AaeAJ10k0ARsSGcmVWIa2IFR5D3fzH3NTSDj9WkxUcYFE0CPG8AVaeetaukcFE";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_chineseCharacters_chineseCharactersReversed() {
        String input = "四千年前有一个姑娘叫姜嫄，她有一天觉得很空虚，就到郊外玩，看见一只巨人脚印，也许是外星人留下的，她想上去比一比，看看谁的脚丫子更大，就踩上去。踩上去就发现肚子里乱动，跟怀了孕似的。回去以后，肚子里的小孩，又老不出来，过了十二个月才生下来。";

        String actual = StringUtility.reverse(input);
        String expected = "。来下生才月个二十了过，来出不老又，孩小的里子肚，后以去回。的似孕了怀跟，动乱里子肚现发就去上踩。去上踩就，大更子丫脚的谁看看，比一比去上想她，的下留人星外是许也，印脚人巨只一见看，玩外郊到就，虚空很得觉天一有她，嫄姜叫娘姑个一有前年千四";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_misplacedQuotationMarks_misplacedQuotationMarksReversed() {
        String input = "<foo val=“bar” />";

        String actual = StringUtility.reverse(input);
        String expected = ">/ ”rab“=lav oof<";
        assertEquals(expected, actual);
    }


    @Test
    public void reverseString_misplacedQuotationMarks2_misplacedQuotationMarks2Reversed() {
        String input = "\"'\"'\"''''\"";

        String actual = StringUtility.reverse(input);
        String expected = "\"''''\"'\"'\"";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_japaneseStyleEmojicons_japaneseStyleEmojiconsReversed() {
        String input = """
                ヽ༼ຈل͜ຈ༽ﾉ ヽ༼ຈل͜ຈ༽ﾉ
                (｡◕ ∀ ◕｡)
                ｀ｨ(´∀｀∩
                __ﾛ(,_,*)
                ・(￣∀￣)・:*:
                ﾟ･✿ヾ╲(｡◕‿◕｡)╱✿･ﾟ
                ,。・:*:・゜’( ☻ ω ☻ )。・:*:・゜’
                (╯°□°）╯︵ ┻━┻)
                (ﾉಥ益ಥ）ﾉ\uFEFF ┻━┻
                ┬─┬ノ( º _ ºノ)
                ( ͡° ͜ʖ ͡°)
                ¯\\_(ツ)_/¯""";

        String actual = StringUtility.reverse(input);
        String expected = """
                ¯/_)ツ(_\\¯
                )°͡ ʖ͜ °͡ (
                )ノº _ º (ノ┬─┬
                ┻━┻ \uFEFFﾉ）ಥ益ಥﾉ(
                )┻━┻ ︵╯）°□°╯(
                ’゜・:*:・。) ☻ ω ☻ (’゜・:*:・。,
                ﾟ･✿╱)｡◕‿◕｡(╲ヾ✿･ﾟ
                :*:・)￣∀￣(・
                )*,_,(ﾛ__
                ∩｀∀´(ｨ｀
                )｡◕ ∀ ◕｡(
                ﾉ༽ຈ͜لຈ༼ヽ ﾉ༽ຈ͜لຈ༼ヽ""";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_arabicHebrew_arabicHebrewReversed() {
        String input = "ثم نفس سقطت وبالتحديد،, جزيرتي باستخدام أن دنو. إذ هنا؟ الستار وتنصيب كان. أهّل ايطاليا، بريطانيا-فرنسا قد أخذ. سليمان، إتفاقية بين ما, يذكر الحدود أي بعد, معاملة بولندا، الإطلاق عل إيو.\n" +
                "בְּרֵאשִׁית, בָּרָא אֱלֹהִים, אֵת הַשָּׁמַיִם, וְאֵת הָאָרֶץ";

        String actual = StringUtility.reverse(input);
        String expected = "ץֶרָאָה תֵאְו ,םִיַמָּׁשַה תֵא ,םיִהֹלֱא אָרָּב ,תיִׁשאֵרְּב\n" +
                ".ويإ لع قالطإلا ،ادنلوب ةلماعم ,دعب يأ دودحلا ركذي ,ام نيب ةيقافتإ ،ناميلس .ذخأ دق اسنرف-ايناطيرب ،ايلاطيا لّهأ .ناك بيصنتو راتسلا ؟انه ذإ .وند نأ مادختساب يتريزج ,،ديدحتلابو تطقس سفن مث";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_zalgoText_zalgoTextReversed() {
        String input = """
                Ṱ̺̺̕o͞ ̷i̲̬͇̪͙n̝̗͕v̟̜̘̦͟o̶̙̰̠kè͚̮̺̪̹̱̤ ̖t̝͕̳̣̻̪͞h̼͓̲̦̳̘̲e͇̣̰̦̬͎ ̢̼̻̱̘h͚͎͙̜̣̲ͅi̦̲̣̰̤v̻͍e̺̭̳̪̰-m̢iͅn̖̺̞̲̯̰d̵̼̟͙̩̼̘̳ ̞̥̱̳̭r̛̗̘e͙p͠r̼̞̻̭̗e̺̠̣͟s̘͇̳͍̝͉e͉̥̯̞̲͚̬͜ǹ̬͎͎̟̖͇̤t͍̬̤͓̼̭͘ͅi̪̱n͠g̴͉ ͏͉ͅc̬̟h͡a̫̻̯͘o̫̟̖͍̙̝͉s̗̦̲.̨̹͈̣
                ̡͓̞ͅI̗̘̦͝n͇͇͙v̮̫ok̲̫̙͈i̖͙̭̹̠̞n̡̻̮̣̺g̲͈͙̭͙̬͎ ̰t͔̦h̞̲e̢̤ ͍̬̲͖f̴̘͕̣è͖ẹ̥̩l͖͔͚i͓͚̦͠n͖͍̗͓̳̮g͍ ̨o͚̪͡f̘̣̬ ̖̘͖̟͙̮c҉͔̫͖͓͇͖ͅh̵̤̣͚͔á̗̼͕ͅo̼̣̥s̱͈̺̖̦̻͢.̛̖̞̠̫̰
                ̗̺͖̹̯͓Ṯ̤͍̥͇͈h̲́e͏͓̼̗̙̼̣͔ ͇̜̱̠͓͍ͅN͕͠e̗̱z̘̝̜̺͙p̤̺̹͍̯͚e̠̻̠͜r̨̤͍̺̖͔̖̖d̠̟̭̬̝͟i̦͖̩͓͔̤a̠̗̬͉̙n͚͜ ̻̞̰͚ͅh̵͉i̳̞v̢͇ḙ͎͟-҉̭̩̼͔m̤̭̫i͕͇̝̦n̗͙ḍ̟ ̯̲͕͞ǫ̟̯̰̲͙̻̝f ̪̰̰̗̖̭̘͘c̦͍̲̞͍̩̙ḥ͚a̮͎̟̙͜ơ̩̹͎s̤.̝̝ ҉Z̡̖̜͖̰̣͉̜a͖̰͙̬͡l̲̫̳͍̩g̡̟̼̱͚̞̬ͅo̗͜.̟
                ̦H̬̤̗̤͝e͜ ̜̥̝̻͍̟́w̕h̖̯͓o̝͙̖͎̱̮ ҉̺̙̞̟͈W̷̼̭a̺̪͍į͈͕̭͙̯̜t̶̼̮s̘͙͖̕ ̠̫̠B̻͍͙͉̳ͅe̵h̵̬͇̫͙i̹͓̳̳̮͎̫̕n͟d̴̪̜̖ ̰͉̩͇͙̲͞ͅT͖̼͓̪͢h͏͓̮̻e̬̝̟ͅ ̤̹̝W͙̞̝͔͇͝ͅa͏͓͔̹̼̣l̴͔̰̤̟͔ḽ̫.͕
                Z̮̞̠͙͔ͅḀ̗̞͈̻̗Ḷ͙͎̯̹̞͓G̻O̭̗̮""";

        String actual = StringUtility.reverse(input);
        String expected = """
                ̮̗̭O̻G͓̞̹̯͎͙Ḷ̗̻͈̞̗Ḁ͔͙̠̞̮ͅZ
                ͕.̫ḽ̴͔̟̤̰͔ḷ̼̹͔͓͏a͇͔̝̞͙͝ͅW̝̹̤ ̟̝̬ͅe̻̮͓͏h̪͓̼͖͢T̲͙͇̩͉̰͞ͅ ̴̖̜̪d͟n̫͎̮̳̳͓̹̕i̵͙̫͇̬h̵e̳͉͙͍̻ͅB̠̫̠ ͖͙̘̕s̶̮̼t̜̯͙̭͕͈į͍̪̺a̷̭̼W͈̟̞̙̺҉ ̮̱͎̖͙̝o͓̯̖h̕ẃ̟͍̻̝̥̜ ͜e̤̗̤̬͝H̦
                ̟.̗͜o̡̬̞͚̱̼̟ͅg̩͍̳̫̲l̬͙̰͖͡a̡̜͉̣̰͖̜̖Z҉ ̝̝.̤s͎̹̩ơ̙̟͎̮͜a͚ḥ̙̩͍̞̲͍̦c̘̭̖̗̰̰̪͘ f̝̻͙̲̰̯̟ǫ͕̲̯͞ ̟ḍ͙̗n̦̝͇͕i̫̭̤m͔̼̩̭҉-͎͟ḙ̢͇v̞̳i̵͉h͚̰̞̻ͅ ͚͜n̙͉̬̗̠a̤͔͓̩͖̦i̝̬̭̟̠͟d̨̖̖͔̖̺͍̤r̠̻̠͜e͚̯͍̹̺̤p͙̺̜̝̘ẕ̗e͕͠N͍͓̠̱̜͇ͅ ͔̣̼̙̗̼͓͏é̲h͈͇̥͍̤Ṯ͓̯̹͖̺̗
                ̛̰̫̠̞̖.̻̦̖̺͈̱͢s̥̣̼o͕̼̗ͅá̵͔͚̣̤h͖͇͓͖̫͔ͅ҉c̮͙̟͖̘̖ ̬̣̘f̪͚͡ǫ ͍g̮̳͓̗͍͖n̦͚͓͠i͚͔͖l̩̥ẹ͖ẹ̴͕̘̀f͖̲̬͍ ̢̤e̲̞h̦͔t̰ ͎̬͙̭͙͈̲g̡̺̣̮̻n̞̠̹̭͙̖i͈̙̫̲ko̫̮v͙͇͇n̦̘̗͝I̡̞͓ͅ
                ̨̣͈̹.̲̦̗s͉̝̙͍̖̟̫o̯̻̫͘a͡h̟̬c͉ͅ͏ ̴͉g͠ṉ̪i̭̼͓̤̬͍͘ͅt̤͇̖̟͎͎̬ǹ̬͚̲̞̯̥͉͜e͉̝͍̳͇̘ṣ̠̺͟e̗̭̻̞̼r͠p͙e̛̘̗r̭̳̱̥̞ ̵̳̘̼̩͙̟̼d̰̯̲̞̺̖nͅi̢m-̰̪̳̭̺e͍̻v̤̰̣̲̦i̲̣̜͙͎͚ͅh̢̘̱̻̼ ͎̬̦̰̣͇e̲̘̳̦̲͓̼h̪̻̣̳͕̝͞t̖ ̤̱̹̪̺̮͚èk̶̠̰̙o̦̘̜̟͟v͕̗̝n͙̪͇̬̲i̷ ͞o̺̺̕Ṱ""";
        assertEquals(expected, actual);
    }

    /*
    # Non-whitespace C0 controls: U+0001 through U+0008, U+000E through U+001F,
    # and U+007F (DEL)
    # Often forbidden to appear in various text-based file formats (e.g. XML),
    # or reused for internal delimiters on the theory that they should never
    # appear in input.
     */
    @Test
    public void reverseString_nonWhitespaceC0controls_nonWhitespaceC0controlsReversed() {
        String input = "";

        String actual = StringUtility.reverse(input);
        String expected = "";
        assertEquals(expected, actual);
    }

}
