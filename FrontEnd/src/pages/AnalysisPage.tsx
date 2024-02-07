import { Tabs } from "flowbite-react";
import { CardDetailTabsTheme } from "../themes/CardDetailTabsTheme";
import Settlement from "../components/Settlement/Settlement";
import ACategoryInfo from "../components/Analysis/Category/ACategoryInfo";
import ACategoryGraph from "../components/Analysis/Category/ACategoryGraph";
import ACategoryTransactionList from "../components/Analysis/Category/ACategoryTransactionList";

export default function AnalysisPage() {
  return (
    <div className="pb-[100px]">
      <Tabs
        theme={CardDetailTabsTheme}
        aria-label="Tabs with underline"
        style="underline"
        className="h-min row-span-8"
      >
        <Tabs.Item active title="통계">
          {/* 통계 최상위 컴포넌트 */}
          <ACategoryInfo />
          <ACategoryGraph />
          <ACategoryTransactionList />
        </Tabs.Item>
        <Tabs.Item title="연말정산">
          <Settlement />
        </Tabs.Item>
      </Tabs>
    </div>
  );
}