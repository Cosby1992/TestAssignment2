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

}
